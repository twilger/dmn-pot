/**
 * 
 */
package com.empire.insurance;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/** 
 * <!-- begin-UML-doc -->
 * <p>An application submitted for auto insurance coverage.</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Application {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The channel through which the application was submitted. An application can be submitted directly by the owner of the vehicle, or on behalf of the owner by a car dealer or insurance broker.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String channel;

	/** 
	* @return the channel
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getChannel() {
		// begin-user-code
		return channel;
		// end-user-code
	}

	/** 
	* @param channel the channel to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setChannel(String channel) {
		// begin-user-code
		this.channel = channel;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The vehicle to be insured.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Vehicle vehicle;

	/** 
	* @return the vehicle
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Vehicle getVehicle() {
		// begin-user-code
		return vehicle;
		// end-user-code
	}

	/** 
	* @param vehicle the vehicle to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setVehicle(Vehicle vehicle) {
		// begin-user-code
		this.vehicle = vehicle;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The drivers named on the application who will be operating the vehicle.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Driver> nonPrimaryDrivers;

	/** 
	* @return the nonPrimaryDrivers
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Driver> getNonPrimaryDrivers() {
		// begin-user-code
		return nonPrimaryDrivers;
		// end-user-code
	}

	/** 
	* @param nonPrimaryDrivers the nonPrimaryDrivers to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNonPrimaryDrivers(List<Driver> nonPrimaryDrivers) {
		// begin-user-code
		this.nonPrimaryDrivers = nonPrimaryDrivers;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The designated primary driver.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public PrimaryDriver primaryDriver;

	/** 
	* @return the primaryDriver
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public PrimaryDriver getPrimaryDriver() {
		// begin-user-code
		return primaryDriver;
		// end-user-code
	}

	/** 
	* @param primaryDriver the primaryDriver to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPrimaryDriver(PrimaryDriver primaryDriver) {
		// begin-user-code
		this.primaryDriver = primaryDriver;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The collision insurance options requested.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<Option> requestedCollisionOptions = new ArrayList<Option>();

	/** 
	* @return the requestedCollisionOptions
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<Option> getRequestedCollisionOptions() {
		// begin-user-code
		return requestedCollisionOptions;
		// end-user-code
	}

	/** 
	* @param requestedCollisionOptions the requestedCollisionOptions to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setRequestedCollisionOptions(List<Option> requestedCollisionOptions) {
		// begin-user-code
		this.requestedCollisionOptions = requestedCollisionOptions;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The requested start date of coverage.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private LocalDate startDate;

	/** 
	* @return the startDate
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public LocalDate getStartDate() {
		// begin-user-code
		return startDate;
		// end-user-code
	}

	/** 
	* @param startDate the startDate to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStartDate(LocalDate startDate) {
		// begin-user-code
		this.startDate = startDate;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The maximum amount of third party coverage requested.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float thirdPartyMaxLiability;

	/** 
	* @return the thirdPartyMaxLiability
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getThirdPartyMaxLiability() {
		// begin-user-code
		return thirdPartyMaxLiability;
		// end-user-code
	}

	/** 
	* @param thirdPartyMaxLiability the thirdPartyMaxLiability to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setThirdPartyMaxLiability(float thirdPartyMaxLiability) {
		// begin-user-code
		this.thirdPartyMaxLiability = thirdPartyMaxLiability;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The maximum amount of collision coverage requested.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float collisionMaxCoverage;

	/** 
	* @return the collisionMaxCoverage
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getCollisionMaxCoverage() {
		// begin-user-code
		return collisionMaxCoverage;
		// end-user-code
	}

	/** 
	* @param collisionMaxCoverage the collisionMaxCoverage to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCollisionMaxCoverage(float collisionMaxCoverage) {
		// begin-user-code
		this.collisionMaxCoverage = collisionMaxCoverage;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The collision deductible amount the applicant is willing to pay.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float collisionDeductibleAmount;

	/** 
	* @return the collisionDeductibleAmount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getCollisionDeductibleAmount() {
		// begin-user-code
		return collisionDeductibleAmount;
		// end-user-code
	}

	/** 
	* @param collisionDeductibleAmount the collisionDeductibleAmount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCollisionDeductibleAmount(float collisionDeductibleAmount) {
		// begin-user-code
		this.collisionDeductibleAmount = collisionDeductibleAmount;
		// end-user-code
	}
}