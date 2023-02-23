package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDef {

	@Given("^Thanos has Infinity Stones$")
	public void thanos_has_Infinity_Stones() throws Throwable {
		System.out.println("Thanos has Infinity Stones");
	}

	@When("^thanos snap his finger$")
	public void thanos_snap_his_finger() throws Throwable {
		System.out.println("thanos snap his finger");
	}

	@Then("^half of living things died$")
	public void half_of_living_things_died() throws Throwable {
		System.out.println("half of living things died");
	}

}
