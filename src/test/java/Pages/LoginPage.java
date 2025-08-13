package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	protected WebDriver driver;
	protected Actions actions;
		
	private By loginButton = By.xpath("//a[@class=\"_1TOQfO\"]//child::span[text()=\"Login\"]");
	private By mobileNumber = By.xpath("//div[@class=\"I-qZ4M vLRlQb\"]//child::input[@type = \"text\"]");
	private By requestOTP = By.xpath("//button[text()=\"Request OTP\"]");
	private By profileSection = By.xpath("//a[@title=\"Ramani Ranjan\"]//child::span[text()=\"Ramani Ranjan\"]");
	private By logoutButton = By.xpath("//a[@title=\"Logout\"]//li[last()]");
	
	public LoginPage(WebDriver driver, Actions actions) {
		this.driver = driver;
		this.actions = actions;
		
//		if (!driver.getTitle().equals("Flipkart"))
//			throw new IllegalStateException("This is not Flipkart. It is "+driver.getCurrentUrl());
	}
	
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void enterMobileNumber(String number) {
		driver.findElement(mobileNumber).sendKeys(number);
	}
	
	public void clickOnRequestOTP() {
		driver.findElement(requestOTP).click();
	}
	
	public void ProfileSectionDisplayed(String name) {
		WebElement myProfile = driver.findElement(profileSection);
		String text = myProfile.getText();
		if (text.contains(name))
			System.out.println("\tValid User has logged in successfully.");
		else
			System.out.println("\tInvalid User logged in.");
	}
	
	public void clickOnLogoutButton() {
		WebElement userProfile = driver.findElement(profileSection);
		actions.moveToElement(userProfile).build().perform();
		driver.findElement(logoutButton).click();
	}
	
}
