package Demo1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mayurlisten implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
