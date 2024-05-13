package objectPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;

public class HospitalPage extends AbstractComponent{

	public HospitalPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div[1]/h1")
	WebElement totalHospital;
	
	@FindBy(xpath = "//*[@class=\"c-estb-info\"]/a")
	List<WebElement> hospitalName;
	
	
	@FindBy(xpath = "//*[@class=\"c-feedback\"]/div/span[1]")
	List<WebElement> rating;

	public WebElement getTotalHospital() {
		return totalHospital;
	}
	
	
	public List<WebElement> getHospitalName() {
		return hospitalName;
	}
	public List<WebElement> getRating() {
		return rating;
	}
}
