package Demo1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	
	@Override
	
	public void onTestSuccess(ITestResult result){
		System.out.println("Tested Successfullly");
		
	}
	
@Override
	
	public void onTestFailure(ITestResult result){
		System.out.println("Test Falied"+ result.getName() );
		
	}
}
