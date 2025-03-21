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
	By FromDropDown= By.cssSelector("div#react-autowhatever-1");
	By FromSearch= By.cssSelector("[role] [type]");
	By FromFirstSugg= By.cssSelector("div#react-autowhatever-1  ul > li:nth-of-type(1)");
	By ToSection= By.cssSelector("[for='toCity']");
	By ToSearch= By.cssSelector("[role] [type]");
	By ToFirstSugg= By.cssSelector("div#react-autowhatever-1  ul > li:nth-of-type(1)");
	By DepartureSection= By.cssSelector("[for='departure']");
	By DepartureDate= By.cssSelector(".DayPicker.Range.Selectable > .DayPicker-wrapper");
	By ReturnSection= By.cssSelector("[data-cy='returnArea'] label");
	By ReturnDate= By.cssSelector(".calHeading.makeFlex > div:nth-of-type(3)");
	By ClassSection= By.cssSelector("[for='travellers']");
	By ApplyBtn= By.cssSelector(".primaryBtn.pushRight");
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
	
	public WebElement getFromDropDown() {
		return GetDriver().findElement(FromDropDown);
		
	}
	
	public WebElement getFromSearch() {
		return GetDriver().findElement(FromSearch);
		
	}
	
	public WebElement getFromFirstSugg() {
		return GetDriver().findElement(FromFirstSugg);
		
	}
	
	public WebElement getToSection() {
		return GetDriver().findElement(ToSection);
		
	}

	public WebElement getToSearch() {
		return GetDriver().findElement(ToSearch);
		
	}
	
	public WebElement getToFirstSugg() {
		return GetDriver().findElement(ToFirstSugg);
		
	}
	
	
	public WebElement getDepartureSection() {
		return GetDriver().findElement(DepartureSection);
		
	}
	
	public WebElement getDepartureDate() {
		return GetDriver().findElement(DepartureDate);
		
	}
	
	public WebElement getReturnSection() {
		return GetDriver().findElement(ReturnSection);
		
	}
	
	public WebElement getReturnDate() {
		return GetDriver().findElement(ReturnDate);
		
	}
	
	public WebElement getClassSection() {
		return GetDriver().findElement(ClassSection);
		
	}
	
	public WebElement getApplyBtn() {
		return GetDriver().findElement(ApplyBtn);
		
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
