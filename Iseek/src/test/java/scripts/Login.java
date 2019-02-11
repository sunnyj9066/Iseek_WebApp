package scripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import function_lib.LoginPage;
import utilities.CaptureScreenshot;
import utilities.ExcelReader;

@Listeners(listeners.TestNG_Listener.class)
public class Login extends BaseClass{
	
  @DataProvider
  public Object[][] getloginData() {
	 Object data [][]=ExcelReader.getTestData("Login");
	 return data;
  }
  
  @Test(dataProvider="getloginData",priority=1)
  public void login(String Username, String Password) throws Exception {
	  System.out.println("----------------Logging into application------------------");
	  loginpage = PageFactory.initElements(driver, LoginPage.class);
	  loginpage.MobileNum.sendKeys(Username);
	  loginpage.Pwd.sendKeys(Password);
	  loginpage.submit.click();
	  CaptureScreenshot.screenshot("Login screen");
	  Thread.sleep(5000);
	  String home_url = driver.getCurrentUrl();
	  Assert.assertTrue(home_url.contains("dashboard"), "HomePage launched successfully");
	  CaptureScreenshot.screenshot("Home screen");
  }
}
