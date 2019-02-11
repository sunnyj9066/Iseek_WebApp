package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import scripts.BaseClass;

public class CaptureScreenshot extends BaseClass{
	
	public static void screenshot(String screenshotName) {

	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(src, new File("C:\\Users\\Sunny\\eclipse-workspace\\Iseek\\Screenshots\\"+screenshotName+".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("------Screenshot captured-------"+screenshotName+"");
	
	}
	
}
