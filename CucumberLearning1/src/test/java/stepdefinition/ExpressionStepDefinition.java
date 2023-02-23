package stepdefinition;

import cucumber.api.java.en.Given;


public class ExpressionStepDefinition {
	
	
	@Given("^I have (\\d+) laptop$")
	public void i_have_laptop(int count) throws Throwable {
		System.out.println("Laptop count is "+ count);
	}

	@Given("^I have scored (\\d+\\.\\d+) gpa$")
	public void i_have_scored_gpa(double gpa) throws Throwable {
	    System.out.println("CGPA is"+ gpa);

	}

	@Given("^\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String name, String name2, String name3) throws Throwable {
		   System.out.println(name + " Name is elder to " + name2 + " and " + name3);

	}

}
