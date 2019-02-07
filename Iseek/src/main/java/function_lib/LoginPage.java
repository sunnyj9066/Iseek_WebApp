package function_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import scripts.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	public WebElement MobileNum;
	
	@FindBy(xpath="//input[@placeholder='Password / PIN']")
	public WebElement Pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	

}
