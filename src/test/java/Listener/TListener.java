package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TListener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("Test is succesfully done");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Test begining");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test failed successfully");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test is starting");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Super SUCCESS");
		
	}

}
