package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestStepDef {
	
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get(
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^user is entering valid username and Password$")
	public void user_is_entering_valid_username_and_Password() throws Throwable {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"
				)).sendKeys("Admin"); driver.findElement(By.xpath(
						"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"
						)).sendKeys("admin123");
	}

	@When("^user is clicking login button$")
	public void user_is_clicking_login_button() throws Throwable {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); 
	}

	@Then("^user should navigated to home page$")
	public void user_should_navigated_to_home_page() throws Throwable {
		boolean status =
				driver.findElement(By.linkText("Employee List")).isDisplayed(); 
		if(status) {
			System.out.println("Its working");
		} 
		else {
			System.out.println("Not WOrking"); 
		}
		driver.close();
	}


}
