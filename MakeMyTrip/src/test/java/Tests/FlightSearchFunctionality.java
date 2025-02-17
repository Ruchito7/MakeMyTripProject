package Tests;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
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
		Assert.assertEquals(flight.getToSearch().isDisplayed(),true);
		flight.getToSearch().sendKeys("Mumbai");
		Thread.sleep(1000);
		flight.getToFirstSugg().click();
		Thread.sleep(2000);
		
		LocalDate today=LocalDate.now();
		LocalDate DepartureDate= today.plusDays(2);
		LocalDate ReturnDate= DepartureDate.plusDays(5);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
		String DepartureDay= DepartureDate.format(formatter);
		String ReturnDay= ReturnDate.format(formatter);
		if(!(flight.getDepartureDate().isDisplayed())) {
			flight.getDepartureSection().click();
		}
		GetDriver().findElement(By.xpath("//div[contains(@aria-label, '" + DepartureDay + "')]")).click();
		Thread.sleep(2000);
		
		if(!(flight.getReturnDate().getDomAttribute("class").contains("active"))) {
			flight.getReturnSection().click();
		}
		GetDriver().findElement(By.xpath("//div[contains(@aria-label, '" + ReturnDay + "')]")).click();
		
		Thread.sleep(2000);
		flight.getClassSection().click();
		Thread.sleep(1000);
		TravellerSelect(2,1,1);
		Thread.sleep(1000);
		flight.getApplyBtn().click();
		Thread.sleep(1000);
		
		flight.getSearchBtn().click();
		Thread.sleep(2000);
		Assert.assertEquals(GetDriver().getCurrentUrl().contains("https://www.makemytrip.com/flight/search?itinerary"), true);
	}


	private void TravellerSelect(int Adults, int Children, int Infants) throws InterruptedException {
		
		if(Adults>0) {
		GetDriver().findElement(By.cssSelector("[data-cy='adults-"+Adults+"']")).click();
		Thread.sleep(2000);
		}
		
		
			GetDriver().findElement(By.cssSelector("[data-cy='children-"+Children+"']")).click();
			Thread.sleep(2000);
			
			GetDriver().findElement(By.cssSelector("[data-cy='infants-"+Infants+"']")).click();
			Thread.sleep(2000);
			
		
	}


	
	
	

}
