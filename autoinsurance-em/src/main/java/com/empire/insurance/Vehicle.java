/**
 * 
 */
package com.empire.insurance;

/** 
 * <!-- begin-UML-doc -->
 * <p>A non-commercial passenger vehicle, which could be a car, an SUV, or a light truck. Motorcycles are not included in this category.</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Vehicle {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The license plate number.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String plate;

	/** 
	* @return the plate
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getPlate() {
		// begin-user-code
		return plate;
		// end-user-code
	}

	/** 
	* @param plate the plate to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPlate(String plate) {
		// begin-user-code
		this.plate = plate;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The model year.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int year;

	/** 
	* @return the year
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getYear() {
		// begin-user-code
		return year;
		// end-user-code
	}

	/** 
	* @param year the year to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setYear(int year) {
		// begin-user-code
		this.year = year;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The estimated number of miles the vehicle is driven each year.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int milesPerYear;

	/** 
	* @return the milesPerYear
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getMilesPerYear() {
		// begin-user-code
		return milesPerYear;
		// end-user-code
	}

	/** 
	* @param milesPerYear the milesPerYear to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setMilesPerYear(int milesPerYear) {
		// begin-user-code
		this.milesPerYear = milesPerYear;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The vehicle class, compact, full size, luxury, etc.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String classification;

	/** 
	* @return the classification
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getClassification() {
		// begin-user-code
		return classification;
		// end-user-code
	}

	/** 
	* @param classification the classification to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setClassification(String classification) {
		// begin-user-code
		this.classification = classification;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The base value of the vehicle, excluding any accessories that have been added by the owner.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int basicValue;

	/** 
	* @return the basicValue
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getBasicValue() {
		// begin-user-code
		return basicValue;
		// end-user-code
	}

	/** 
	* @param basicValue the basicValue to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setBasicValue(int basicValue) {
		// begin-user-code
		this.basicValue = basicValue;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The value of the accessories added to the vehicle by the owner.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int accessoriesValue;

	/** 
	* @return the accessoriesValue
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getAccessoriesValue() {
		// begin-user-code
		return accessoriesValue;
		// end-user-code
	}

	/** 
	* @param accessoriesValue the accessoriesValue to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setAccessoriesValue(int accessoriesValue) {
		// begin-user-code
		this.accessoriesValue = accessoriesValue;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The horse power classification for the vehicle.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String horsePower;

	/** 
	* @return the horsePower
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getHorsePower() {
		// begin-user-code
		return horsePower;
		// end-user-code
	}

	/** 
	* @param horsePower the horsePower to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setHorsePower(String horsePower) {
		// begin-user-code
		this.horsePower = horsePower;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The primary manner in which the vehicle is used, personal, commuting, etc.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String usage;

	/** 
	* @return the usage
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getUsage() {
		// begin-user-code
		return usage;
		// end-user-code
	}

	/** 
	* @param usage the usage to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setUsage(String usage) {
		// begin-user-code
		this.usage = usage;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The ownership status of the vehicle, owned, leased, or financed.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String ownership;

	/** 
	* @return the ownership
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getOwnership() {
		// begin-user-code
		return ownership;
		// end-user-code
	}

	/** 
	* @param ownership the ownership to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setOwnership(String ownership) {
		// begin-user-code
		this.ownership = ownership;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of airbags in the vehicle.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nbAirbags;

	/** 
	* @return the nbAirbags
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNbAirbags() {
		// begin-user-code
		return nbAirbags;
		// end-user-code
	}

	/** 
	* @param nbAirbags the nbAirbags to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNbAirbags(int nbAirbags) {
		// begin-user-code
		this.nbAirbags = nbAirbags;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of passengers the vehicle can carry, including the driver.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nbPlaces;

	/** 
	* @return the nbPlaces
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNbPlaces() {
		// begin-user-code
		return nbPlaces;
		// end-user-code
	}

	/** 
	* @param nbPlaces the nbPlaces to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNbPlaces(int nbPlaces) {
		// begin-user-code
		this.nbPlaces = nbPlaces;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The maximum insured value of the vehicle.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private double maxInsuredValue;

	/** 
	* @return the maxInsuredValue
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public double getMaxInsuredValue() {
		// begin-user-code
		return maxInsuredValue;
		// end-user-code
	}

	/** 
	* @param maxInsuredValue the maxInsuredValue to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setMaxInsuredValue(double maxInsuredValue) {
		// begin-user-code
		this.maxInsuredValue = maxInsuredValue;
		// end-user-code
	}
}