/**
 * 
 */
package com.empire.insurance.ext;

import com.empire.insurance.Driver;

/** 
 * <!-- begin-UML-doc -->
 * Extender Class for BOM Entity: Driver
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class DriverExtender {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aDriver
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static void MarkLicenseSuspendedAsFalse(Driver aDriver) {
		// begin-user-code
		aDriver.setLicenseSuspended(false);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aDriver
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static boolean IsLicenseSuspendedFalse(Driver aDriver) {
		// begin-user-code
		return !aDriver.isLicenseSuspended();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aDriver
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static boolean IsLicenseSuspendedTrue(Driver aDriver) {
		// begin-user-code
		return aDriver.isLicenseSuspended();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param aDriver
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static void MarkLicenseSuspendedAsTrue(Driver aDriver) {
		// begin-user-code
		aDriver.setLicenseSuspended(true);
		// end-user-code
	}
}