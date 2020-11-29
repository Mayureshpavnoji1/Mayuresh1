package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGPRactice1 {


	@Test(priority = 1)
	
	public void firstTest(){
		
		System.out.println("First Test");
	}
	
	
	@Test(priority = 2 , groups  = "MayaGang")	
public void secondTest(){
		
		System.out.println("Second Test");
	}

	
	@Test(priority = 3 , dependsOnMethods  = "secondTest")

public void thirdTest(){
	
	System.out.println("Third Test");
}
	

}
