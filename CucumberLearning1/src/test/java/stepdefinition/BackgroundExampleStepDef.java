package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExampleStepDef {
	
	@Given("^student complete High School$")
	public void student_complete_High_School() throws Throwable {
	   System.out.println("student complete High School");
	}

	@Given("^student complete Higher Secondary school$")
	public void student_complete_Higher_Secondary_school() throws Throwable {
		System.out.println("student complete Higher secondary School");
	}
	
	@Given("^student applied for medical course$")
	public void student_applied_for_medical_course() throws Throwable {
	    System.out.println("student applied for medical course");
	}

	@When("^student cleared entrance exam$")
	public void student_cleared_entrance_exam() throws Throwable {
		System.out.println("student cleared entrance exam");
	}

	@Then("^Student is eligible for joining any medical institue$")
	public void student_is_eligible_for_joining_any_medical_institue() throws Throwable {
		System.out.println("Student is eligible for joining any medical institue");
	}

	@Given("^student applied for engineer course$")
	public void student_applied_for_engineer_course() throws Throwable {
		System.out.println("student applied for engineer course");
	}

	@When("^student must have elgible cutoff$")
	public void student_must_have_elgible_cutoff() throws Throwable {
		System.out.println("student must have elgible cutoff");
	}

	@Then("^student is eligible for joining any engineering institue$")
	public void student_is_eligible_for_joining_any_engineering_institue() throws Throwable {
		System.out.println("student is eligible for joining any engineering institue");
	}

}
