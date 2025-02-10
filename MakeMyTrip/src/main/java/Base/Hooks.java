package Base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BasePage {

	public Hooks() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void Setup() {
		GetDriver().get(GetUrl());
		
	}
	
	@AfterTest
	public void End() {
		WebDriverInstance.CleanUpDriver();
	}

}
