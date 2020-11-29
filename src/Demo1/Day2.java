package Demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeTest(groups = {"smoke"})
	
	public void Day() {
		System.out.println("I will  execute Before Test");
		
		

}
	@Parameters ({"URL","password"})
	@Test
	
	public void toInclude(String Urlname,String passsword) {
		System.out.println("Yippee");
		System.out.println(Urlname);
		System.out.println(passsword);
	}
	
	@Test (dataProvider = "MultipleSets")
	public void catchData(String Username1 , String Password1) {
		System.out.println(Username1);
		System.out.println(Password1);
	}

	@Test(enabled = false)
	public void toInclude3() {
		System.out.println("Yippee3toExclude");
	}
@DataProvider
	
	public Object[][] MultipleSets() {
	
	Object[][] data = new Object[3][2];
	data [0][0] = "Mayu1";
	data [0][1] = "Pav1";
	data [1][0] = "Mayu2";
	data [1][1] = "Pav2";
	data [2][0] = "Mayu3";
	data [2][1] = "Pav3";
	
	return data;		
	}
		@Test (dependsOnMethods = "toInclude")
		public void Apanpahile() {
			System.out.println("Alpha madhe pahile");
		}
		

	
@BeforeMethod(groups = {"smoke"})
	
	public void befMethod1() {
		System.out.println("I will  execute Before Medhod");
		
		

}

@AfterMethod

public void aftMethod1() {
	System.out.println("I will  execute After Medhod");
	
	

}


	@Test
	public void toInclude5() {
		System.out.println("Yippee");
	}
@AfterTest
	
	public void dayLast() {
		System.out.println("I will  execute After Test");
		
		

}



}
