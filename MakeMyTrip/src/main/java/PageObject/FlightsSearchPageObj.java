package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class FlightsSearchPageObj extends BasePage{

	public FlightsSearchPageObj() throws IOException {
		super();
		
	}
	
	By OneWayBtn= By.cssSelector("[data-cy='oneWayTrip']");
	By RoundTripBtn= By.cssSelector("[data-cy='roundTrip']");
	By MultyCityBtn= By.cssSelector("[data-cy='mulitiCityTrip']");
	By FromSection= By.cssSelector("[for='fromCity']");
	By ToSection= By.cssSelector(".returnPersuasion div:nth-child(3)");
	By DepartureSection= By.cssSelector("[for='departure']");
	By ReturnSection= By.cssSelector("[data-cy='returnArea'] label");
	By ClassSection= By.cssSelector("[for='travellers']");
	By RegularTab= By.cssSelector(".hrtlCenter .fareCardItem:nth-of-type(1)");
	By StudentTab= By.cssSelector(".hrtlCenter .fareCardItem:nth-of-type(2)");
	By SiniorCitizenTab= By.cssSelector(".hrtlCenter .fareCardItem:nth-of-type(3)");
	By ArmedForcesTab= By.cssSelector(".hrtlCenter .fareCardItem:nth-of-type(4)");
	By DoctorTab= By.cssSelector(".hrtlCenter .fareCardItem:nth-of-type(5)");
	By SearchBtn= By.cssSelector(".widgetSearchBtn");
	
	
	public WebElement getOneWayBtn() {
		return GetDriver().findElement(OneWayBtn);
		
	}
	
	public WebElement getRoundTripBtn() {
		return GetDriver().findElement(RoundTripBtn);
		
	}
	
	public WebElement getMultyCityBtn() {
		return GetDriver().findElement(MultyCityBtn);
		
	}
	
	public WebElement getFromSection() {
		return GetDriver().findElement(FromSection);
		
	}
	
	public WebElement getToSection() {
		return GetDriver().findElement(ToSection);
		
	}
	
	public WebElement getDepartureSection() {
		return GetDriver().findElement(DepartureSection);
		
	}
	
	public WebElement getReturnSection() {
		return GetDriver().findElement(ReturnSection);
		
	}
	
	public WebElement getClassSection() {
		return GetDriver().findElement(ClassSection);
		
	}
	
	public WebElement getRegularTab() {
		return GetDriver().findElement(RegularTab);
		
	}
	
	public WebElement getStudentTab() {
		return GetDriver().findElement(StudentTab);
		
	}
	
	public WebElement getSiniorCitizenTab() {
		return GetDriver().findElement(SiniorCitizenTab);
		
	}
	
	public WebElement getArmedForcesTab() {
		return GetDriver().findElement(ArmedForcesTab);
		
	}
	
	public WebElement getDoctorTab() {
		return GetDriver().findElement(DoctorTab);
		
	}
	
	public WebElement getSearchBtn() {
		return GetDriver().findElement(SearchBtn);
		
	}

}
