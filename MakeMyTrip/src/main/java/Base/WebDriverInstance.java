package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverInstance {
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<>();
	
	public static WebDriver GetDriver() {
		if(driver.get()==null) {
			try {
				driver.set(CreateDriver());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
		
	}
	
	public static WebDriver CreateDriver() throws IOException {
		WebDriver driver=null;
		Properties prop= new Properties();
		FileInputStream data= new FileInputStream("C:\\Users\\ruchi\\SSelenium\\MMTProject\\MakeMyTrip\\src\\main\\java\\Resources\\config.Properties");
		prop.load(data);
		
		if(prop.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}else {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void CleanUpDriver() {
		if(driver.get()!=null) {
			driver.get().quit();
		}
	}

}
