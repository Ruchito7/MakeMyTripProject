package Tests;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Hooks;
import PageObject.FlightsSearchPageObj;
import PageObject.TopNavPageObj;

public class FlightSearchFunctionality extends Hooks {

	public FlightSearchFunctionality() throws IOException {
		super();
	}
	
	
	@Test
	public void RoundTripFlightSearch() throws IOException, InterruptedException {
		TopNavPageObj nav= new TopNavPageObj();
		Assert.assertEquals(nav.getFlightsBtn().getDomAttribute("class").contains("active"),true);
		FlightsSearchPageObj flight= new FlightsSearchPageObj();
		flight.getRoundTripBtn().click();
		Assert.assertEquals(flight.getRoundTripBtn().getDomAttribute("class").contains("selected"),true);
		flight.getFromSection().click();
		Assert.assertEquals(flight.getFromDropDown().isDisplayed(),true);
		flight.getFromSearch().sendKeys("Pune");
		Thread.sleep(1000);
		flight.getFromFirstSugg().click();
		
		Thread.sleep(2000);
		
		flight.getToSection().click();
		Thread.sleep(2000);
		
	}
	

}
