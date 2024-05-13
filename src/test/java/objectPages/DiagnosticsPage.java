package objectPages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponent;

public class DiagnosticsPage extends AbstractComponent{

	public DiagnosticsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//*[@class=\"nav-mid\"]/div[4]")
	WebElement labTest;
	
	@FindBy(xpath = "//div[@class=\"ReactModal__Content ReactModal__Content--after-open\"]")
	WebElement diagnosticModal;
	
	@FindBy(xpath = "//div[@class =\"u-margint--standard o-f-color--primary\"]")
	List<WebElement> topCities;
	
	
	By diagnosticModal2 =By.xpath("//div[@class=\"ReactModal__Content ReactModal__Content--after-open\"]");
	
	public WebElement getLabTest() {
		return labTest;
	}
	public WebElement getDiagnosticModal() {
		return diagnosticModal;
	}
	
	public boolean isModalDisplayed() {
		try {
			waitForElementToAppear(diagnosticModal2);
			if(diagnosticModal.isDisplayed()) {
				return  true;
			}else {
				return false;
			}	
		}catch(Exception e) {
			return false;
		}
				
	}
	
	public List<WebElement> getTopCities() {
		return topCities;
	}
	
	

}
