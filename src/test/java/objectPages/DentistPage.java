package objectPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import AbstractComponents.AbstractComponent;

public class DentistPage extends AbstractComponent{

	//Constructor
	public DentistPage(WebDriver driver) {
		super(driver);
	}

	// Locators
	@FindBy(xpath = "//h1[@class='u-xx-large-font u-bold']")
	WebElement totalDoctors;
	
	@FindBy(xpath = "//div[@class='c-filter__top']//div[2]")
	WebElement patientStoriesFilter;
	
	@FindBy(xpath = "(//li[@class='c-dropdown__list__item'])[3]")
	WebElement patientStoriesOptionOne;
	
	@FindBy(xpath = "//div[@class='c-filter__top']//div[3]")
	WebElement experienceFilter;
	
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]/ul/li[1]/span")
	WebElement experienceFilterOptionOne;
	
	@FindBy(xpath = "//div[@class='u-d-inlineblock u-color--white u-c-pointer']/span")
	WebElement allFilters;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[2]/div/label[2]/span/span")
	WebElement aboveRs500;
	//////*[@id="container"]/div/div[3]/div/div/header/div[2]/div/div[1]/div/label[2]/span/span

	////*[@id="container"]/div/div[3]/div/div/header/div[2]/div/div[2]/div/label[3]/span/span
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[3]/div/label[3]/span/span")
	WebElement availableTomorrow;
	
	@FindBy(xpath = "//span[@class='c-sort-dropdown__selected c-dropdown__selected']")
	WebElement relevanceFilter;
	
	@FindBy(xpath = "//div[@aria-label='Click to view all sorting options']//ul[@role='listbox']/li[2]/span")
	WebElement relevanceOptionTwo;
	
	@FindBy(xpath = "//div[@class='OurDepartments-module_container__ZTtOP dweb:pl-52px pb-12px mb-8px']/div/div[1]")
	WebElement generalSurgery;
	
	@FindBy(xpath = "//h2[@class='doctor-name']")
	List<WebElement> dentists;
	
	@FindBy(xpath = "//div[@class='u-grey_3-text']/div[2]")
	List<WebElement> dentistsExperience;
	
	@FindBy(xpath = "//span[@data-qa-id='practice_locality']")
	List<WebElement> dentistsLocation;
	
	@FindBy(xpath = "//span[@data-qa-id='doctor_clinic_name']")
	List<WebElement> dentistsClinic;
	
	@FindBy(xpath = "//span[@data-qa-id='consultation_fee']")
	List<WebElement> dentistsConsultationFees;
	
	@FindBy(xpath = "//span[@data-qa-id='doctor_recommendation']")
	List<WebElement> dentistsDentistsRating;
	
	// Actions
	public WebElement getTotalDoctors() {
		return totalDoctors;
	}
	
	public WebElement getPatientStoriesFilter() {
		return patientStoriesFilter;
	}
	public WebElement getPatientStoriesOptionOne() {
		return patientStoriesOptionOne;
	}
	public WebElement getExperienceFilter() {
		return experienceFilter;
	}
	public WebElement getExperienceFilterOptionOne() {
		return experienceFilterOptionOne;
	}
	
	public WebElement getAllFilters() {
		return allFilters;
	}
	public WebElement getAboveRs500() {
		return aboveRs500;
	}
	public WebElement getAvailableTomorrow() {
		return availableTomorrow;
	}
	public WebElement getRelevanceFilter() {
		return relevanceFilter;
	}
	public WebElement getRelevanceOptionTwo() {
		return relevanceOptionTwo;
	}

	public List<WebElement> getDentists() {
		return dentists;
	}

	public List<WebElement> getDentistsExperience() {
		return dentistsExperience;
	}

	public List<WebElement> getDentistsLocation() {
		return dentistsLocation;
	}

	public List<WebElement> getDentistsClinic() {
		return dentistsClinic;
	}

	public List<WebElement> getDentistsConsulationFees() {
		return dentistsConsultationFees;
	}

	public List<WebElement> getDentistsRating() {
		return dentistsDentistsRating;
	}
	
}
