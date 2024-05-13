package testComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectPages.CorporateWellnessPage;
import objectPages.HomePage;
import testBase.BaseClass;

import java.io.IOException;

public class TC_004_CorporateWellness_ValidDetails extends BaseClass {
	@Test
	public void openingCorporateWellness() throws IOException, InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.getForCorporates();
		hp.getWellnessPlans();
		CorporateWellnessPage cw = new CorporateWellnessPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 100)");
		cw.setName();
		cw.setOrganizationName();
		cw.setContactNumber();
		cw.setEmail().sendKeys("test@test.com");
		cw.getOrgranizationSize();
		Select select1 = new Select(
				driver.findElement(By.xpath("//header[@id='header']//select[@id='organizationSize']")));
		select1.selectByVisibleText("<500");
		cw.getInterestedIn();
		Select select2 = new Select(driver.findElement(By.xpath("//header[@id='header']//select[@id='interestedIn']")));
		select2.selectByVisibleText("Taking a demo");
		captureScreenShot("Valid details");
		if (cw.getScheduleButton().isEnabled()) {
			System.out.println("Schedule button is enabled!");
		}
		cw.getScheduleButton().click();
		Thread.sleep(15000);

		captureScreenShot("Valid details");
		String heading = cw.getThankYou();
		String paragraph = cw.getThankYouParagraph();
		System.out.println(heading);
		System.out.println(paragraph);

	}
}
