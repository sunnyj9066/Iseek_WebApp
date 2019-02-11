package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case started and details are: "+result.getName());	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and details are: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed and details are: "+result.getName());		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and details are: "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
