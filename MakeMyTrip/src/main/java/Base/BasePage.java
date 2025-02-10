package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	private Properties prop;
	private String Url;
	
	public BasePage() throws IOException {
		prop= new Properties();
		FileInputStream data= new FileInputStream("C:\\Users\\ruchi\\SSelenium\\MMTProject\\MakeMyTrip\\src\\main\\java\\Resources\\config.Properties");
		prop.load(data);
	}
	
	public static WebDriver GetDriver() {
		return WebDriverInstance.GetDriver();
		
	}
	
	public String GetUrl() {
		Url=prop.getProperty("url");
		return Url;
	}
	
	public void TakeSnapShot() throws IOException {
		File srcFile= ((TakesScreenshot)GetDriver()).getScreenshotAs(OutputType.FILE);
		File DestFile= new File(System.getProperty("C:\\Users\\ruchi\\SSelenium\\MMTProject\\MakeMyTrip\\target\\ScreenShots",TimeStamp()+".png"));
		FileUtils.copyFile(srcFile, DestFile);
	}
	
	public static String TimeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
	}

}
