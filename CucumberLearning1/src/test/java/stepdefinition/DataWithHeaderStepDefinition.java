package stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataWithHeaderStepDefinition {
	
	WebDriver driver;
	@Given("^Go to login page$")
	public void go_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	@When("^enter credentials$")
	public void enter_credentials(DataTable dataTable) throws Throwable {
	    
		List<Map<String, String>> keyvaluepair = dataTable.asMaps(String.class, String.class);
	    String username = keyvaluepair.get(0).get("UserName");
	   String password = keyvaluepair.get(1).get("Password");
	   
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username); 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password); 
	}
	@And("^click login button$")
	public void click_login_button() {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		click();
	}


}
