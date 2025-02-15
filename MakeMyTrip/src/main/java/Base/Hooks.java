package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObject.TopNavPageObj;

public class Hooks extends BasePage {

	public Hooks() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void Setup() throws IOException, InterruptedException {
		GetDriver().get(GetUrl());
		GetDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TopNavPageObj topNav= new TopNavPageObj();
		topNav.getCloseCross().click();
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void End() {
		WebDriverInstance.CleanUpDriver();
	}

}
