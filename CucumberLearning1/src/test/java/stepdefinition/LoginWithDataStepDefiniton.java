package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithDataStepDefiniton {
	
	WebDriver driver;
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\2143925\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * driver = new ChromeDriver();
		 */
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get(
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@When("^user is entering valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_entering_valid_credentials_and(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username); 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);  
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		click();
	}

	@Then("^user should see the home page$")
	public void user_should_see_the_home_page() throws Throwable {
		driver.close();
	}

}
