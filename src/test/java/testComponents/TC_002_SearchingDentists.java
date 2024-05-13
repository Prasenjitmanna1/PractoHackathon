package testComponents;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import objectPages.DentistPage;
import objectPages.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtilities;

public class TC_002_SearchingDentists extends BaseClass {
	public ExtentTest test;
	public ExtentReports extent;

	@Test(priority = 1)
	public void searchingDentists() throws InterruptedException, IOException {

		captureScreenShot("HomePage");
		HomePage hp = new HomePage(driver);

		hp.setLocSearchBox(driver).click();
		waitForElementToAppear(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[1]/span/a/i"));
		hp.setLocSearchBox(driver).clear();
		hp.setLocSearchBox(driver).sendKeys("Bangalor");
		Thread.sleep(2000);
		hp.setLocClick().click();
		hp.setTypeSearchBox(driver).click();
		Thread.sleep(2000);
		hp.setTypeSearchBox(driver).sendKeys("Dentist");
		Thread.sleep(2000);
		hp.setDentistType().click();
	}

	@Test(priority = 2)
	public void gettingDentists() throws InterruptedException, IOException {

		DentistPage dp = new DentistPage(driver);

		dp.getPatientStoriesFilter().click();
		Thread.sleep(2000);
		dp.getPatientStoriesOptionOne().click();
		Thread.sleep(2000);
		dp.getExperienceFilter().click();
		Thread.sleep(2000);
		dp.getExperienceFilterOptionOne().click();
		Thread.sleep(2000);
		dp.getAllFilters().click();
		Thread.sleep(5000);
		dp.getAboveRs500().click();
		Thread.sleep(2000);
		dp.getAllFilters().click();
		Thread.sleep(5000);
		dp.getAvailableTomorrow().click();
		dp.getAllFilters().click();
		Thread.sleep(2000);
		dp.getRelevanceFilter().click();
		Thread.sleep(2000);
		dp.getRelevanceOptionTwo().click();

		captureScreenShot("Dentists_Page");

		String totalDentists = dp.getTotalDoctors().getText();
		System.out.println("------------- Total Dentists -------------");
		System.out.println(totalDentists);

		List<WebElement> dentistsNames = dp.getDentists();
		List<WebElement> dentistsExperience = dp.getDentistsExperience();
		List<WebElement> dentistsLocation = dp.getDentistsLocation();
		List<WebElement> detnistsClinic = dp.getDentistsClinic();
		List<WebElement> dentistsRating = dp.getDentistsRating();
		System.out.println("\n------------- Dentist Details -------------");
		for (int i = 0; i < 5; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", dentistsExperience.get(i));
			captureScreenShot("dentist" + (i + 1));
			Thread.sleep(1000);
			System.out.println("\nDoctor " + (i + 1));
			System.out.println("Name: " + dentistsNames.get(i).getText());
			System.out.println("Experience: " + dentistsExperience.get(i).getText());
			System.out.println("Location: " + dentistsLocation.get(i).getText());
			System.out.println("Clinic: " + detnistsClinic.get(i).getText());
			System.out.println("Rating: " + dentistsRating.get(i).getText());

			ExcelUtilities.writeExcel("Doctor Details", i, 0, dentistsNames.get(i).getText());
			ExcelUtilities.writeExcel("Doctor Details", i, 1, dentistsExperience.get(i).getText());
			ExcelUtilities.writeExcel("Doctor Details", i, 2, dentistsLocation.get(i).getText());
			ExcelUtilities.writeExcel("Doctor Details", i, 3, detnistsClinic.get(i).getText());
			ExcelUtilities.writeExcel("Doctor Details", i, 4, dentistsRating.get(i).getText());

			System.out.println();
		}

		System.out.println("\n--------------------------");
	}

}
