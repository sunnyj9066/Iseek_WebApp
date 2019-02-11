package function_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import scripts.BaseClass;

public class Logout extends BaseClass{

	@FindBy(xpath="//mat-icon[text()='keyboard_arrow_down']")
	public WebElement logoutdropdown;
	
	@FindBy(xpath="//span[text()='Logout']")
	public WebElement logoutbtn;
	
}
