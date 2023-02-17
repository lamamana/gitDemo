package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("i am before class");
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("i am after class");
	}
	@Parameters({"URL", "APIKey/username0"})
	@Test
	public void WebLoginCarLoan(String urlname, String key) {
	System.out.println("Web Login Car Loan");
	System.out.println(urlname);
	System.out.println(key);
	}

	@Test()
	public void MobileloginCarLoan() {
		System.out.println("Mobile Login Car Loan");
		
	}
	@Test()
	public void MobilecheckoutCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}

	@Test(dataProvider="getData")
	public void MobilesigninarLoan(String username, String password) {
		System.out.println("Mobile Login Car Loan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups = {"smoke"})
	public void MobilesignoutCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}

	@Test (enabled=false)
	public void APILoginCarLoan() {
		System.out.println("API Login Car Loan");
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data =new Object[3][2];
		
		//01st 
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		//02nd
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
	
		//03rd 
		data[2][0]="thirdsetusername";
		data[2][1]="thirddsetpassword";
		
		return data;
	}
}
