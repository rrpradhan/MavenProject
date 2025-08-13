package StepDefinitionsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	//@Before
	public void browserSetup() {
		System.out.println("I am inside browerSetup()");
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}
	
	//@After
	public void tearDown() {
		System.out.println("I am inside tearDown()");
		//driver.close();
		driver.quit();
	}
	
	//@Before & @After -> executed before and after each scenarios!
	//@BeforeStep & @AfterStep - executed before and after each steps!
	//In case of multiple similar tags we can user order property like @Before(order=1) 
	//Conditional tags -> @Before("@Smoke")
	//Sequence + Condition -> @Before(value="@Smoke", order=1)
	
	@Given("user comes to login page")
	public void user_comes_to_login_page() {
		
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on submit")
	public void clicks_on_submit() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() {

	}

	@Then("user is navigated back to login page")
	public void user_is_navigated_back_to_login_page() {

	}

}
