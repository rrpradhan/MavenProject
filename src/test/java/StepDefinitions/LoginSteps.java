package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

//	WebDriver driver = null;
//	WebElement profileSection = null;
//	WebElement loginButton = null;
//	
//	
//	@Given("our browser is open")
//	public void our_broswer_is_open() {		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		
//		driver.manage().window().maximize();
//	}
//	
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		driver.navigate().to("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		
//		loginButton = driver.findElement(By.xpath("//a[@class=\"_1TOQfO\"]//child::span[text()=\"Login\"]"));
//		loginButton.click();
//		Thread.sleep(2000);
//	}
//
//	@When("^user enters (.*) and generates OTP$")
//	public void user_enters_mobile_number_and_generates_OTP(String mobilenumber) 
//	throws InterruptedException {
//		driver
//		.findElement(By.xpath("//div[@class=\"I-qZ4M vLRlQb\"]//child::input[@type = \"text\"]"))
//		.sendKeys(mobilenumber);
//		Thread.sleep(2000);
//		
//		driver
//		.findElement(By.xpath("//button[text()=\"Request OTP\"]"))
//		.click();
//		Thread.sleep(10000);
//	}
//
//
//	@And("^user is navigated to the home page having (.*) as user name$")
//	public void user_is_navigated_to_the_home_page(String name) throws InterruptedException {
//		profileSection = driver.findElement(By.xpath("//a[@title=\"Ramani Ranjan\"]//child::span[text()=\"Ramani Ranjan\"]"));
//
//		//profileSection.isDisplayed();
//		String text = profileSection.getText();
//		if (text.contains(name))
//			System.out.println("\tValid User has logged in successfully.");
//		else
//			System.out.println("\tInvalid User logged in.");
//		
//		Thread.sleep(2000);
//	}
//	
//	@Then("user logs out")
//	public void user_logs_out() throws InterruptedException {
//		Actions actions = new Actions(driver);
//		actions.moveToElement(profileSection).build().perform();
//		
//		driver
//		.findElement(By.xpath("//a[@title=\"Logout\"]//li[last()]"))
//		.click();
//		
//		driver.close();
//		driver.quit();
//	}

}
