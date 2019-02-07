package common_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import scripts.BaseClass;

public class AppSpecific_Methods extends BaseClass{

	public static void Double_Click(WebElement ele) {
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

}
