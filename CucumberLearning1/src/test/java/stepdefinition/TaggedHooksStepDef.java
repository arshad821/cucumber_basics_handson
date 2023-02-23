package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedHooksStepDef {

	@Given("^this is first step$")
	public void this_is_first_step() throws Throwable {
		System.out.println("this is first step");
	}

	@When("^This is second step$")
	public void this_is_second_step() throws Throwable {
		System.out.println("This is second step");
	}

	@Then("^this is third step$")
	public void this_is_third_step() throws Throwable {
		System.out.println("this is third step");
	}


}
