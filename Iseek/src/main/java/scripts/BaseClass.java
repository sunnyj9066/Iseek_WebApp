package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import Helper.BrowserFactory;
import common_lib.AppSpecific_Methods;
import common_lib.Common_Methods;
import function_lib.CreateOffersPage;
import function_lib.LoginPage;
import function_lib.Logout;
import utilities.CaptureScreenshot;

public class BaseClass{
	
	public static LoginPage loginpage;
	public static Logout logout;
	public static CreateOffersPage crpage;
	public static WebDriver driver;
	
	  @Parameters({"baseUrl"})
	  @BeforeSuite
	  public void setUp(String baseUrl) {
		  BrowserFactory.StartBrowser("chrome");
		  driver.get(baseUrl);
		  Common_Methods.ImplicitWait(40);
	  }
	  
	  @Parameters({"userName","Password"})
	  @BeforeClass
	  public void login(String userName, String Password) throws Exception {
		  System.out.println("----------------Logging into application------------------");
		  
		  try {
			  loginpage = PageFactory.initElements(driver, LoginPage.class);
			  crpage = PageFactory.initElements(driver, CreateOffersPage.class);
			  loginpage.MobileNum.sendKeys(userName);
			  loginpage.Pwd.sendKeys(Password);
			  CaptureScreenshot.screenshot("Login screen");
			  loginpage.submit.click();
			  Common_Methods.ExplicitWait(crpage.CreateOffers_btn);
			  String home_url = driver.getCurrentUrl();
			  System.out.println("The current URL is "+home_url);
			  Assert.assertTrue(home_url.contains("dashboard"),"HomePage launched successfully"); 
			  CaptureScreenshot.screenshot("Home screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	  
	  @AfterClass
	  public void logout() {
		  System.out.println("---------------Logout from application-----------------");
		  logout.logoutdropdown.click();
		  logout.logoutbtn.click();
	  }
}
