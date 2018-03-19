/**
 * 
 */
package com.empire.insurance;

import java.util.ArrayList;
import java.util.List;

/** 
 * <!-- begin-UML-doc -->
 * <p>An insurance proposal</p>
 * <!-- end-UML-doc -->
 * @author admin
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Response {
	/** 
	* <!-- begin-UML-doc -->
	* <p>The status of the proposal, which can be thought of as the status of the application: Refused, Accepted, or Process Manually.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String status;

	/** 
	* @return the status
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getStatus() {
		// begin-user-code
		return status;
		// end-user-code
	}

	/** 
	* @param status the status to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStatus(String status) {
		// begin-user-code
		this.status = status;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The message provided back to the applicant if the application is rejected.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private List<java.lang.String> messages;

	/** 
	* @return the messages
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public List<java.lang.String> getMessages() {
		// begin-user-code
		return messages;
		// end-user-code
	}

	/** 
	* @param messages the messages to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setMessages(List<java.lang.String> messages) {
		// begin-user-code
		this.messages = messages;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>The proposed insurance policy offered to the applicant, if the application is accepted.</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private AutoInsurance proposedAutoInsurancePolicy;

	/** 
	* @return the proposedAutoInsurancePolicy
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public AutoInsurance getProposedAutoInsurancePolicy() {
		// begin-user-code
		return proposedAutoInsurancePolicy;
		// end-user-code
	}

	/** 
	* @param proposedAutoInsurancePolicy the proposedAutoInsurancePolicy to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setProposedAutoInsurancePolicy(AutoInsurance proposedAutoInsurancePolicy) {
		// begin-user-code
		this.proposedAutoInsurancePolicy = proposedAutoInsurancePolicy;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private CollisionInsurance proposedCollisionInsurancePolicy;

	/** 
	* @return the proposedCollisionInsurancePolicy
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public CollisionInsurance getProposedCollisionInsurancePolicy() {
		// begin-user-code
		return proposedCollisionInsurancePolicy;
		// end-user-code
	}

	/** 
	* @param proposedCollisionInsurancePolicy the proposedCollisionInsurancePolicy to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setProposedCollisionInsurancePolicy(CollisionInsurance proposedCollisionInsurancePolicy) {
		// begin-user-code
		this.proposedCollisionInsurancePolicy = proposedCollisionInsurancePolicy;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param responses
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static Response combineResponses(List<Response> responses) {
		// begin-user-code
		Response retVal = null;
		if (responses == null || responses.size() == 0) {
			retVal = new Response();
			retVal.setStatus("Accepted");
		} else {
			retVal = responses.get(0);

			for (int i = 1; i < responses.size(); i++) {
				// set the status to the highest value !This won't work because it is now a string
				// TODO: Fix this
				if (responses.get(i).getStatus().compareTo(retVal.getStatus()) > 0) {
					retVal.setStatus(responses.get(i).getStatus());
				}

				// append any messages
				retVal.getMessages().addAll(responses.get(i).getMessages());
			}
		}

		return retVal;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Response() {
		// begin-user-code
		messages = new ArrayList<String>();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param status
	* @param message
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public static Response createResponse(String status, String message) {
		// begin-user-code
		Response retVal = new Response();
		retVal.setStatus(status);
		retVal.setMessages(new ArrayList<String>());
		retVal.getMessages().add(message);
		
		return retVal;
		// end-user-code
	}
}