package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class TopNavPageObj extends BasePage{

	public TopNavPageObj() throws IOException {
		super();
		
	}
	
	By CloseCross = By.cssSelector(".commonModal__close");
	By FlightsBtn= By.cssSelector(".menu_Flights > span");
	By HotelsBtn= By.cssSelector(".menu_Hotels > span");
	By HomeStayBtn= By.cssSelector(".menu_Homestays .headerIcons");
	By HldyPkgBtn= By.cssSelector(".removeItemMargin .headerIcons");
	By TrainsBtn= By.cssSelector(".menu_Trains > span");
	By BusesBtn= By.cssSelector(".menu_Buses .headerIcons");
	By CabsBtn= By.cssSelector(".menu_Cabs .headerIcons");
	By ForexCardBtn= By.cssSelector(".menu_Forex .headerIcons");
	By InsuranceBtn= By.cssSelector(".menu_TravelInsurance .headerIcons");
	
	
	
	public  WebElement getCloseCross() {
		return GetDriver().findElement(CloseCross);
		
	}
	
	public  WebElement getFlightsBtn() {
		return GetDriver().findElement(FlightsBtn);
		
	}
	
	public  WebElement getHotelsBtn() {
		return GetDriver().findElement(HotelsBtn);
		
	}
	
	public  WebElement getHomeStayBtn() {
		return GetDriver().findElement(HomeStayBtn);
		
	}
	
	public  WebElement getHldyPkgBtn() {
		return GetDriver().findElement(HldyPkgBtn);
		
	}
	
	public  WebElement getTrainsBtn() {
		return GetDriver().findElement(TrainsBtn);
		
	}
	
	public  WebElement getBusesBtn() {
		return GetDriver().findElement(BusesBtn);
		
	}
	
	public  WebElement getCabsBtn() {
		return GetDriver().findElement(CabsBtn);
		
	}
	
	public  WebElement getForexCardBtn() {
		return GetDriver().findElement(ForexCardBtn);
		
	}
	
	public  WebElement getInsuranceBtn() {
		return GetDriver().findElement(InsuranceBtn);
		
	}

}

