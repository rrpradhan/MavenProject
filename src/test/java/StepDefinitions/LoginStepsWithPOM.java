package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsWithPOM {

//	WebDriver driver = null;
//	WebElement profileSection = null;
//	WebElement loginButton = null;
//	LoginPage login;
//	Actions actions;
//	
//	@Given("our browser is open")
//	public void our_broswer_is_open() {		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		actions = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
//		driver.manage().window().maximize();
//	}
//	
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		login = new LoginPage(driver, actions);
//		
//		driver.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		
//		login.clickOnLoginButton();
//		Thread.sleep(2000);
//	}
//
//	@When("^user enters (.*) and generates OTP$")
//	public void user_enters_mobile_number_and_generates_OTP(String mobilenumber) 
//	throws InterruptedException {
//		login.enterMobileNumber(mobilenumber);
//		Thread.sleep(2000);
//		
//		login.clickOnRequestOTP();
//		Thread.sleep(10000);
//	}
//
//
//	@And("^user is navigated to the home page having (.*) as user name$")
//	public void user_is_navigated_to_the_home_page(String name) throws InterruptedException {
//		login.ProfileSectionDisplayed(name);
//		Thread.sleep(2000);
//	}
//	
//	@Then("user logs out")
//	public void user_logs_out() {
//		login.clickOnLogoutButton();
//		
//		driver.close();
//		driver.quit();
//	}

}
