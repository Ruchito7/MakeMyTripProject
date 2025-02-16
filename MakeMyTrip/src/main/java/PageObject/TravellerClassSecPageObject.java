package PageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BasePage;

public class TravellerClassSecPageObject extends BasePage {

	public TravellerClassSecPageObject() throws IOException {
		super();
		
	}
	
	By TravellerClassSec= By.cssSelector("[for='travellers']");
	By AdultsSelection= By.cssSelector(".appendBottom20 > .gbCounter:nth-child(2)");
	By ChildrenSelection= By.cssSelector(".childCounter .guestCounter");
	By EnfantsSelection= By.cssSelector(".infantCounter .guestCounter");
	By ClassSelection=By.cssSelector(".classSelect");
	
	public WebElement getTravellerClassSec() {
		return GetDriver().findElement(TravellerClassSec);
		
	}
	
	public WebElement getAdultsSelection() {
		return GetDriver().findElement(AdultsSelection);
		
	}
	
	public WebElement getChildrenSelection() {
		return GetDriver().findElement(ChildrenSelection);
		
	}

	
	public WebElement getEnfantsSelection() {
		return GetDriver().findElement(EnfantsSelection);
		
	}
	
	public WebElement getClassSelection() {
		return GetDriver().findElement(ClassSelection);
		
	}



}
