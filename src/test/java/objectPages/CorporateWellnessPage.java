package objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;

public class CorporateWellnessPage extends AbstractComponent {
	public CorporateWellnessPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//header[@id='header']//input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//header[@id='header']//input[@id='organizationName']")
	WebElement organizationName;
	@FindBy(xpath = "//header[@id='header']//input[@id='contactNumber']")
	WebElement contactNumber;
	@FindBy(xpath = "//header[@id='header']//input[@id='officialEmailId']")
	WebElement email;
	@FindBy(xpath = "//header[@id='header']//select[@id='organizationSize']")
	WebElement organizationSize;
	@FindBy(xpath = "//header[@id='header']//select[@id='interestedIn']")
	WebElement interestedIn;
	@FindBy(xpath = "//header[@id='header']//button[@type='submit'][normalize-space()='Schedule a demo']")
	WebElement scheduleButton;

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]")
	WebElement thankYouModal;
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]")
	WebElement thankYou;
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[2]")
	WebElement thankYouParagraph;

	public void setName() {
		name.sendKeys("Test");
	}

	public void setOrganizationName() {
		organizationName.sendKeys("TestOrg");
	}

	public void setContactNumber() {
		contactNumber.sendKeys("9503289768");
	}

	public WebElement setEmail() {
		return email;
	}

	public void getOrgranizationSize() {
		organizationSize.click();
	}

	public void getInterestedIn() {
		interestedIn.click();
	}

	public WebElement getScheduleButton() {
		return scheduleButton;
	}

	public boolean getThankYouModal() {
		return thankYouModal.isDisplayed();
	}

	public String getThankYou() {
		return thankYou.getText();
	}

	public String getThankYouParagraph() {
		return thankYouParagraph.getText();
	}
}
