package common_lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import scripts.BaseClass;

public class Common_Methods extends BaseClass{
	
	public static void ImplicitWait(long Time) {
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
	}
	
	public static WebElement ExplicitWait(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele;
	}
}
