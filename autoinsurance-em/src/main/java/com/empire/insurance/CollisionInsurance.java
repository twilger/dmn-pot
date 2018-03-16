/**
 * 
 */
package com.empire.insurance;

import java.util.ArrayList;
import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <p>The collision insurance proposed.</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CollisionInsurance {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The proposed maximum amount of collision coverage.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float collisionMaxAmountCovered;

	/** 
	* @return the collisionMaxAmountCovered
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getCollisionMaxAmountCovered() {
		// begin-user-code
		return collisionMaxAmountCovered;
		// end-user-code
	}

	/** 
	* @param collisionMaxAmountCovered the collisionMaxAmountCovered to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCollisionMaxAmountCovered(float collisionMaxAmountCovered) {
		// begin-user-code
		this.collisionMaxAmountCovered = collisionMaxAmountCovered;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The proposed deductible.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float deductibleAmount;

	/** 
	* @return the deductibleAmount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getDeductibleAmount() {
		// begin-user-code
		return deductibleAmount;
		// end-user-code
	}

	/** 
	* @param deductibleAmount the deductibleAmount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setDeductibleAmount(float deductibleAmount) {
		// begin-user-code
		this.deductibleAmount = deductibleAmount;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The price of collision insurance before taxes.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private float collisionPriceBeforeTax;

	/** 
	* @return the collisionPriceBeforeTax
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public float getCollisionPriceBeforeTax() {
		// begin-user-code
		return collisionPriceBeforeTax;
		// end-user-code
	}

	/** 
	* @param collisionPriceBeforeTax the collisionPriceBeforeTax to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCollisionPriceBeforeTax(float collisionPriceBeforeTax) {
		// begin-user-code
		this.collisionPriceBeforeTax = collisionPriceBeforeTax;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The the priced insurance options proposed.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<PricedOption> pricedOptions = new ArrayList<PricedOption>();

	/** 
	* @return the pricedOptions
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<PricedOption> getPricedOptions() {
		// begin-user-code
		return pricedOptions;
		// end-user-code
	}

	/** 
	* @param pricedOptions the pricedOptions to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPricedOptions(List<PricedOption> pricedOptions) {
		// begin-user-code
		this.pricedOptions = pricedOptions;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private AutoInsurance autoInsurance;

	/** 
	* @return the autoInsurance
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public AutoInsurance getAutoInsurance() {
		// begin-user-code
		return autoInsurance;
		// end-user-code
	}

	/** 
	* @param autoInsurance the autoInsurance to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setAutoInsurance(AutoInsurance autoInsurance) {
		// begin-user-code
		this.autoInsurance = autoInsurance;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public CollisionInsurance() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}
}