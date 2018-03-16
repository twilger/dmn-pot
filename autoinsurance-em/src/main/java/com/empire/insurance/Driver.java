/**
 * 
 */
package com.empire.insurance;

import java.time.LocalDate;

/** 
 * <!-- begin-UML-doc -->
 * <p>A person designated as an operator of the vehicle to be insured. </p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Driver {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The driver's first name.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String firstName;

	/** 
	* @return the firstName
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getFirstName() {
		// begin-user-code
		return firstName;
		// end-user-code
	}

	/** 
	* @param firstName the firstName to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setFirstName(String firstName) {
		// begin-user-code
		this.firstName = firstName;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The driver's last name.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String lastName;

	/** 
	* @return the lastName
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getLastName() {
		// begin-user-code
		return lastName;
		// end-user-code
	}

	/** 
	* @param lastName the lastName to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLastName(String lastName) {
		// begin-user-code
		this.lastName = lastName;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The driver's gender.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String gender;

	/** 
	* @return the gender
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getGender() {
		// begin-user-code
		return gender;
		// end-user-code
	}

	/** 
	* @param gender the gender to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setGender(String gender) {
		// begin-user-code
		this.gender = gender;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The driver's birthdate.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private LocalDate birthDate;

	/** 
	* @return the birthDate
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public LocalDate getBirthDate() {
		// begin-user-code
		return birthDate;
		// end-user-code
	}

	/** 
	* @param birthDate the birthDate to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setBirthDate(LocalDate birthDate) {
		// begin-user-code
		this.birthDate = birthDate;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of months that the driver has been licensed to drive.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int licenseAgeInMonths;

	/** 
	* @return the licenseAgeInMonths
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getLicenseAgeInMonths() {
		// begin-user-code
		return licenseAgeInMonths;
		// end-user-code
	}

	/** 
	* @param licenseAgeInMonths the licenseAgeInMonths to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLicenseAgeInMonths(int licenseAgeInMonths) {
		// begin-user-code
		this.licenseAgeInMonths = licenseAgeInMonths;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of times the driver's license has be withdrawn.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nbLicenseWithdrawals;

	/** 
	* @return the nbLicenseWithdrawals
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNbLicenseWithdrawals() {
		// begin-user-code
		return nbLicenseWithdrawals;
		// end-user-code
	}

	/** 
	* @param nbLicenseWithdrawals the nbLicenseWithdrawals to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNbLicenseWithdrawals(int nbLicenseWithdrawals) {
		// begin-user-code
		this.nbLicenseWithdrawals = nbLicenseWithdrawals;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of accidents that the driver has been involved in over the last five years.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nbAccidentsInLastFiveYears;

	/** 
	* @return the nbAccidentsInLastFiveYears
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNbAccidentsInLastFiveYears() {
		// begin-user-code
		return nbAccidentsInLastFiveYears;
		// end-user-code
	}

	/** 
	* @param nbAccidentsInLastFiveYears the nbAccidentsInLastFiveYears to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNbAccidentsInLastFiveYears(int nbAccidentsInLastFiveYears) {
		// begin-user-code
		this.nbAccidentsInLastFiveYears = nbAccidentsInLastFiveYears;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The number of accidents that for which the driver was found at fault in the last five years.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int nbAccidentsDriversFaultInLastFiveYears;

	/** 
	* @return the nbAccidentsDriversFaultInLastFiveYears
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNbAccidentsDriversFaultInLastFiveYears() {
		// begin-user-code
		return nbAccidentsDriversFaultInLastFiveYears;
		// end-user-code
	}

	/** 
	* @param nbAccidentsDriversFaultInLastFiveYears the nbAccidentsDriversFaultInLastFiveYears to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNbAccidentsDriversFaultInLastFiveYears(int nbAccidentsDriversFaultInLastFiveYears) {
		// begin-user-code
		this.nbAccidentsDriversFaultInLastFiveYears = nbAccidentsDriversFaultInLastFiveYears;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>A flag that indicates if the driver's license is currently suspended according to the DMV.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private boolean licenseSuspended;

	/** 
	* @return the licenseSuspended
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isLicenseSuspended() {
		// begin-user-code
		return licenseSuspended;
		// end-user-code
	}

	/** 
	* @param licenseSuspended the licenseSuspended to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLicenseSuspended(boolean licenseSuspended) {
		// begin-user-code
		this.licenseSuspended = licenseSuspended;
		// end-user-code
	}
}