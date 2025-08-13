package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(xpath = "//a[@title=\"Ramani Ranjan\"]//child::span[text()=\"Ramani Ranjan\"]")
	WebElement profileSection;
	
	@FindBy(xpath = "//a[@title=\"Logout\"]//li[last()]")
	WebElement logoutButton;
	
	protected WebDriver driver;
	protected Actions actions;
	
	public HomePage_PF(WebDriver driver, Actions actions) {
		this.driver = driver;
		this.actions = actions;
		PageFactory.initElements(driver, this);
	}
	
	public void ProfileSectionDisplayed(String name) {
		String text = profileSection.getText();
		if (text.contains(name))
			System.out.println("\tValid User has logged in successfully.");
		else
			System.out.println("\tInvalid User logged in.");
	}
	
	public void clickOnLogoutButton() {
		actions.moveToElement(profileSection).build().perform();
		logoutButton.click();
	}
}
