package Demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
	
	
	
@BeforeMethod (enabled  = false)
	
	public void befMethod() {
		System.out.println("I will  execute Before Medhod");
		
		

}
	@Test(dependsOnMethods = "befMethod")
	
	
	public void toExclude(){
		System.out.println("To Exclude");
	}
	
	
	
	public void toExclude2(){
		System.out.println("To Exclude");
	}
@BeforeSuite
	
	public void befSuite() {
		System.out.println("Mey Suite Se Pehele");
		
		

}

@AfterSuite

public void aftSuite() {
	System.out.println("Mey Suite Se Pehele");
	
	

}

@Test (timeOut = 4000)
	public void toExclude3(){
		System.out.println("To Exclude");
	}

@Test
	public void toExclude4(){
		System.out.println("To Exclude");
	}
	
@AfterMethod
	
	public void aftMethod() {
		System.out.println("I will  execute After Medhod");
		
		

}

}
