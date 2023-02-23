package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleStepDef {
	
WebDriver driver;
	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://www.google.co.in");
	}

	@When("^user is typing search term \"([^\"]*)\"$")
	public void user_is_typing_search_term(String searchTerm) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^hitting enter button$")
	public void hitting_enter_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^user should see the result$")
	public void user_should_see_the_result() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("arsh")).isDisplayed();
		if(status) {
			System.out.println("It is displayed");
		}
	}

}
