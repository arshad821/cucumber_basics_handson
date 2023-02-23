package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataWithoutHeaderStepDefinition {
	
	WebDriver driver;
	
	@Given("^Human is on the login page$")
	public void human_is_on_the_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\2143925\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@When("^you are entering below credentials$")
	public void you_are_entering_below_credentials(DataTable dataTable) throws Throwable {
		List<String> credentials = dataTable.asList(String.class);
		String userName = credentials.get(0);
		String passWord = credentials.get(1);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(userName); 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(passWord);   

	}

	@When("^click the login button$")
	public void click_the_login_button() throws Throwable {
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).
		click();
	}

}
