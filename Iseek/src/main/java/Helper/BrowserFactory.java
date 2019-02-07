package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import scripts.BaseClass;

public class BrowserFactory extends BaseClass{

	public static WebDriver StartBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sunny\\eclipse-workspace\\Iseek\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunny\\eclipse-workspace\\Iseek\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else
		if(BrowserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Sunny\\eclipse-workspace\\Iseek\\Drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
}
