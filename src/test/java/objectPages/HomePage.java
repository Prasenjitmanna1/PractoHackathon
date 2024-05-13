package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	//dropdown item
	@FindBy(xpath= "//div[text()=\"Bangalore\"]")
	WebElement locClick;
	
	@FindBy(xpath = "//div[@class='c-omni-suggestion-list']/div[1]/div[1]/span[1]")
	WebElement dentistType;
	
	@FindBy(xpath = "//div[contains(text(),'Surgeries')]")
	WebElement surgeries;
	
	@FindBy(xpath = "//div[@class='para cushion-right-large display-inline nav-items nav-items--additional-link hover-dark u-d-trigger dropdown-toggle']")
	WebElement forCorporates;

	@FindBy(xpath = "//div[@class='u-d nav-dropdown text-left active-state']/div[1]/a")
	WebElement wellnessPlans;
	
	
	@FindBy(xpath = "//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[2]")
	WebElement hospitalType;
	
	By locSearchBox = By.xpath(
			"//div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--locality']//div[@class='c-omni-searchbox_wrapper ']/input");

	By typeSearchBox = By.xpath(
			"//div[@class='c-omni__wrapper u-clearfix c-omni__wrapper--keyword']//div[@class='c-omni-searchbox_wrapper ']/input");
	

	public WebElement setLocSearchBox(WebDriver driver) {
		return driver.findElement(locSearchBox);
	}
	
	public WebElement setTypeSearchBox(WebDriver driver) {
		return driver.findElement(typeSearchBox);
	}
	
	public WebElement setLocClick() {
		return locClick;
	}
	
	public WebElement setDentistType() {
		return dentistType;
	}
	
	public WebElement getSurgeries() {
		return surgeries;
	}
	
	public void getForCorporates() {
		forCorporates.click();
	}

	public void getWellnessPlans() {
		wellnessPlans.click();
	}
	
	public WebElement setHospitalType() {
		return hospitalType;
	}

}
