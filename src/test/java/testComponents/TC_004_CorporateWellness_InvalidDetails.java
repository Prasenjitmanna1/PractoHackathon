package testComponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectPages.CorporateWellnessPage;
import objectPages.HomePage;
import testBase.BaseClass;

public class TC_004_CorporateWellness_InvalidDetails extends BaseClass {

	@Test(priority = 1)
	public void checkingInvalidDetails1() throws IOException, InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getForCorporates();
		hp.getWellnessPlans();

		CorporateWellnessPage cw = new CorporateWellnessPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 100)");
		cw.setName();
		cw.setOrganizationName();
		cw.setContactNumber();
		cw.setEmail().sendKeys("test");

		if (!cw.getScheduleButton().isEnabled()) {
			captureScreenShot("Invalid  Form Details");
			System.out.println("Schedule button is disabled");
		}
		cw.getOrgranizationSize();
		Select select1 = new Select(
				driver.findElement(By.xpath("//header[@id='header']//select[@id='organizationSize']")));
		select1.selectByVisibleText("<500");
		cw.getInterestedIn();
		Select select2 = new Select(
				driver.findElement(By.xpath("//header[@id='header']//select[@id='interestedIn']")));
		select2.selectByVisibleText("Taking a demo");
		cw.getScheduleButton();
	}
	
	
}
