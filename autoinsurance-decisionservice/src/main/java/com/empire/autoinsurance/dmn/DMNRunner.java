package com.empire.autoinsurance.dmn;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.dmn.api.core.DMNContext;
import org.kie.dmn.api.core.DMNDecisionResult;
import org.kie.dmn.api.core.DMNModel;
import org.kie.dmn.api.core.DMNResult;
import org.kie.dmn.api.core.DMNRuntime;
import org.kie.dmn.api.core.ast.InputDataNode;

import com.empire.insurance.Application;
import com.empire.insurance.Driver;
import com.empire.insurance.PrimaryDriver;
import com.empire.insurance.Vehicle;

public class DMNRunner {

	public static void main(String[] args) {
			KieServices kieServices = KieServices.Factory.get();
	
			KieContainer kieContainer = kieServices.getKieClasspathContainer();
			
			DMNRuntime dmnRuntime = kieContainer.newKieSession().getKieRuntime( DMNRuntime.class );
			DMNModel dmnModel = dmnRuntime.getModel("http://www.trisotech.com/dmn/definitions/_3627cefb-bf09-4244-95bc-d062ad98ac2e", "empire-autoinsurance");
			
			if (dmnModel != null) {
				System.out.println("DMN Model: " + dmnModel.toString());			
			} else {
				System.out.println("DMN Model is null!");
			}
			
			// <<< optional check
			Set<InputDataNode> inputs = dmnModel.getInputs();
			for (InputDataNode inputDataNode : inputs) {
				System.out.println(inputDataNode.getType());
			}
			//  optional check >>>
			
			DMNContext dmnContext = dmnRuntime.newContext();
			
			Application application = createApplication();
			
			dmnContext.set("Application", application);
	
			DMNResult dmnResult = dmnRuntime.evaluateAll(dmnModel, dmnContext);
	
			for (DMNDecisionResult dr : dmnResult.getDecisionResults()) {
				System.out.println("Decision '" + dr.getDecisionName() + "' : " + dr.getResult());
			}
	}
	
	private static Application createApplication() {
		Application retVal = new Application();
		
		retVal.setPrimaryDriver(createPrimaryDriver());
		retVal.setNonPrimaryDrivers(createNonPrimaryDrivers());
		retVal.setChannel("Broker");
		retVal.setCollisionDeductibleAmount(500.0F);
		retVal.setCollisionMaxCoverage(100000.0F);
		retVal.setStartDate(LocalDate.parse("2018-03-01"));
		retVal.setThirdPartyMaxLiability(50000.0F);
		
		retVal.setVehicle(createVehicle());
		
		
		return retVal;
	}

	private static Vehicle createVehicle() {
		Vehicle retVal = new Vehicle();
		retVal.setHorsePower("ClassA");
		
		return retVal;
	}

	private static List<Driver> createNonPrimaryDrivers() {
		List<Driver> retVal = new ArrayList<Driver>();
		
		Driver driver = new Driver();
		retVal.add(driver);
		driver.setBirthDate(LocalDate.parse("1988-11-15"));
		driver.setFirstName("Bobby Lee");
		driver.setLastName("Smith");
		driver.setGender("Male");
		driver.setLicenseAgeInMonths(100);
		driver.setLicenseSuspended(false);
		driver.setNbAccidentsDriversFaultInLastFiveYears(2);
		driver.setNbAccidentsInLastFiveYears(3);
		driver.setNbLicenseWithdrawals(1);
		
		driver = new Driver();
		retVal.add(driver);
		driver.setBirthDate(LocalDate.parse("1989-04-15"));
		driver.setFirstName("Daisy");
		driver.setLastName("Smith");
		driver.setGender("Female");
		driver.setLicenseAgeInMonths(60);
		driver.setLicenseSuspended(false);
		driver.setNbAccidentsDriversFaultInLastFiveYears(0);
		driver.setNbAccidentsInLastFiveYears(0);
		driver.setNbLicenseWithdrawals(0);
		return retVal;
	}

	private static PrimaryDriver createPrimaryDriver() {
		PrimaryDriver primaryDriver = new PrimaryDriver();
		Driver driver = new Driver();
		primaryDriver.setDriver(driver);
		driver.setBirthDate(LocalDate.parse("1975-10-12"));
		driver.setFirstName("Joe");
		driver.setLastName("Smith");
		driver.setGender("Male");
		driver.setLicenseAgeInMonths(200);
		driver.setLicenseSuspended(false);
		driver.setNbAccidentsDriversFaultInLastFiveYears(1);
		driver.setNbAccidentsInLastFiveYears(2);
		driver.setNbLicenseWithdrawals(0);
		
		primaryDriver.setGarageLocationType("Rural");
		primaryDriver.setGarageType("HomeGarage");
		primaryDriver.setMaritalStatus("Married");
		primaryDriver.setOccupation("Employed");

		return primaryDriver;
	}
	



}
