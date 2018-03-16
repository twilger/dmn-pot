/**
 * 
 */
package com.empire.insurance;

import java.time.LocalDate;

/** 
 * <!-- begin-UML-doc -->
 * <p>The proposed auto insurance. </p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AutoInsurance {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The start date of insurance.</p>
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
	* <p>The total price of the proposed policy with tax.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float totalPriceBeforeTax;

	/** 
	* @return the totalPriceBeforeTax
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getTotalPriceBeforeTax() {
		// begin-user-code
		return totalPriceBeforeTax;
		// end-user-code
	}

	/** 
	* @param totalPriceBeforeTax the totalPriceBeforeTax to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTotalPriceBeforeTax(float totalPriceBeforeTax) {
		// begin-user-code
		this.totalPriceBeforeTax = totalPriceBeforeTax;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The price of third party insurance without tax.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float thirdPartyPriceBeforeTax;

	/** 
	* @return the thirdPartyPriceBeforeTax
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getThirdPartyPriceBeforeTax() {
		// begin-user-code
		return thirdPartyPriceBeforeTax;
		// end-user-code
	}

	/** 
	* @param thirdPartyPriceBeforeTax the thirdPartyPriceBeforeTax to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setThirdPartyPriceBeforeTax(float thirdPartyPriceBeforeTax) {
		// begin-user-code
		this.thirdPartyPriceBeforeTax = thirdPartyPriceBeforeTax;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The total price of the policy including tax. This includes the price of third party insurance, collision insurance, and priced options. </p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float totalPrice;

	/** 
	* @return the totalPrice
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getTotalPrice() {
		// begin-user-code
		return totalPrice;
		// end-user-code
	}

	/** 
	* @param totalPrice the totalPrice to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTotalPrice(float totalPrice) {
		// begin-user-code
		this.totalPrice = totalPrice;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The proposed maximum third party coverage amount.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float thirdPartyMaxLiabilityAmount;

	/** 
	* @return the thirdPartyMaxLiabilityAmount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getThirdPartyMaxLiabilityAmount() {
		// begin-user-code
		return thirdPartyMaxLiabilityAmount;
		// end-user-code
	}

	/** 
	* @param thirdPartyMaxLiabilityAmount the thirdPartyMaxLiabilityAmount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setThirdPartyMaxLiabilityAmount(float thirdPartyMaxLiabilityAmount) {
		// begin-user-code
		this.thirdPartyMaxLiabilityAmount = thirdPartyMaxLiabilityAmount;
		// end-user-code
	}

	/** 
	* @return the type
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getType() {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public AutoInsurance() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}
}