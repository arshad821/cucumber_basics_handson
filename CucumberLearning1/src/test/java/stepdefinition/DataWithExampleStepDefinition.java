package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataWithExampleStepDefinition {


	WebDriver driver;
	@Given("^Go login page$")
	public void go_login_page() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver.get(
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@When("^you entered credentials \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void you_entered_credentials_and_password(String username, String pw) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username); 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pw); 
	}
//	@And("^click login button$")
	//public void click_login_button() {
		//driver.findElement(By.xpath(
				//"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		//click();
	//}

}
