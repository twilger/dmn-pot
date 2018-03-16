/**
 * 
 */
package com.empire.insurance;

/** 
 * <!-- begin-UML-doc -->
 * <p>Insurance coverage options requested by the applicant.</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Option {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The option requested, theft, bodily injury, etc.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String type;

	/** 
	* @return the type
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	* @param type the type to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setType(String type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The maximum amount of coverage for the option.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float maxLiability;

	/** 
	* @return the maxLiability
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getMaxLiability() {
		// begin-user-code
		return maxLiability;
		// end-user-code
	}

	/** 
	* @param maxLiability the maxLiability to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setMaxLiability(float maxLiability) {
		// begin-user-code
		this.maxLiability = maxLiability;
		// end-user-code
	}
}