package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(xpath = "//a[@class=\"_1TOQfO\"]//child::span[text()=\"Login\"]")
	WebElement loginButton;
	
	@FindBy(xpath = "//div[@class=\"I-qZ4M vLRlQb\"]//child::input[@type = \"text\"]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "//button[text()=\"Request OTP\"]")
	WebElement requestOTP;
	
	protected WebDriver driver;
	protected Actions actions;
	
	public LoginPage_PF(WebDriver driver, Actions actions) {
		this.driver = driver;
		this.actions = actions;
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void enterMobileNumber(String number) {
		mobileNumber.sendKeys(number);
	}
	
	public void clickOnRequestOTP() {
		requestOTP.click();
	}
	
}
