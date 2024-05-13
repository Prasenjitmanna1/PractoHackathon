package testComponents;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectPages.HomePage;
import objectPages.HospitalPage;
import testBase.BaseClass;
import utilities.ExcelUtilities;




public class TC_001_FindingHospital extends BaseClass {
	
	
	@Test(priority = 1)
	public void searchingHospital() throws InterruptedException, IOException {
		captureScreenShot("HomePage");
		HomePage hp = new HomePage(driver);
		
		hp.setLocSearchBox(driver).click();
		//wait for logo to appeaer
		waitForElementToAppear(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[1]/span/a/i"));

		hp.setLocSearchBox(driver).clear();
		hp.setLocSearchBox(driver).sendKeys("Bangalor");
		Thread.sleep(2000);
		hp.setLocClick().click();
		
		hp.setTypeSearchBox(driver).click();
		Thread.sleep(2000);
		hp.setTypeSearchBox(driver).sendKeys("Hospital");
		Thread.sleep(2000);
		hp.setHospitalType().click();
		
		
	}
	
	
	@Test(priority=2)
	public void gettingHospital() throws InterruptedException, IOException {
		int rowNo=0;
		HospitalPage hp = new HospitalPage(driver);

		captureScreenShot("Hospital_Page");

		
		String totalHospital = hp.getTotalHospital().getText();
		System.out.println("------------- Total Hospital -------------");
		System.out.println(totalHospital);
		
	
		List<WebElement> hospitalNames = hp.getHospitalName();
		List<WebElement> ratings = hp.getRating();
		

		System.out.println("\n------------- Hospital Details -------------");
		
		for (int i = 0; i < 5; i++) {
			
			
			
			String ratingStr = ratings.get(i).getText();
			double rating = Double.parseDouble(ratingStr);
			
			if(rating>=3.5) {
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView()", ratings.get(i));
				captureScreenShot("hospital" + (i + 1));
				
				String hospitalName= hospitalNames.get(i).getText();
				System.out.println("\nHospital " + (i + 1));
				System.out.println("Name: " +hospitalName);
				System.out.println("Rating: " +ratingStr);
				ExcelUtilities.writeExcel("Hospital Details", rowNo,0, hospitalName);				
				ExcelUtilities.writeExcel("Hospital Details", rowNo,1, ratingStr);
				rowNo++;
			}
			
			
		}

		System.out.println("\n--------------------------");
	}

}
