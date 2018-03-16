/**
 * 
 */
package com.empire.insurance;

/** 
 * <!-- begin-UML-doc -->
 * <p>A proposed insurance option that has been priced.</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PricedOption {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The proposed price of the option before taxes.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float priceBeforeTax;

	/** 
	* @return the priceBeforeTax
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getPriceBeforeTax() {
		// begin-user-code
		return priceBeforeTax;
		// end-user-code
	}

	/** 
	* @param priceBeforeTax the priceBeforeTax to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPriceBeforeTax(float priceBeforeTax) {
		// begin-user-code
		this.priceBeforeTax = priceBeforeTax;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Option option;

	/** 
	* @return the option
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Option getOption() {
		// begin-user-code
		return option;
		// end-user-code
	}

	/** 
	* @param option the option to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setOption(Option option) {
		// begin-user-code
		this.option = option;
		// end-user-code
	}
}