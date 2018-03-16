package com.empire.insurance.ext;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class is used to store derived facts, within the object model.
 *
 */
public class ExtensionHelper
{
   public static ThreadLocal<ConcurrentHashMap<Integer, ConcurrentHashMap<String,Object>>> facts = new ThreadLocal<ConcurrentHashMap<Integer, ConcurrentHashMap<String,Object>>>();

   public static Object getFact(Object aTarget, String aKey)
   {
       ConcurrentHashMap<Integer, ConcurrentHashMap<String,Object>> allFactsForAllObjects = facts.get();

       if (allFactsForAllObjects == null)
       {
           return null;
       }

       ConcurrentHashMap<String,Object> factsForObject = allFactsForAllObjects.get(System.identityHashCode(aTarget));
       if (factsForObject == null)
       {
           return null;
       }

       return factsForObject.get(aKey);
   }

   public static Object getFact(Object aTarget, String aKey, Object aDefaultValue)
   {
       ConcurrentHashMap<Integer, ConcurrentHashMap<String,Object>> allFactsForAllObjects = facts.get();

       if (allFactsForAllObjects == null)
       {
           return null;
       }

       ConcurrentHashMap<String,Object> factsForObject = allFactsForAllObjects.get(System.identityHashCode(aTarget));
       if (factsForObject == null)
       {
           return null;
       }

       Object value = factsForObject.get(aKey);
       if (value == null)
       {
           return aDefaultValue;
       }

       return value;
   }

   public static void setFact(Object aTarget, String aKey, Object aValue)
   {
       ConcurrentHashMap<Integer, ConcurrentHashMap<String,Object>> allFactsForAllObjects = facts.get();

       if (allFactsForAllObjects == null)
       {
           allFactsForAllObjects = new ConcurrentHashMap<Integer, ConcurrentHashMap<String, Object>>();
           facts.set(allFactsForAllObjects);
       }

       ConcurrentHashMap<String,Object> factsForObject = allFactsForAllObjects.get(System.identityHashCode(aTarget));
       if (factsForObject == null)
       {
           factsForObject = new ConcurrentHashMap<String, Object>();
           allFactsForAllObjects.put(System.identityHashCode(aTarget), factsForObject);
       }

       factsForObject.put(aKey, aValue);
   }

   public static void dispose()
   {
       facts.remove();
   }
}