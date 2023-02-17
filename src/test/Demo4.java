package test;

import org.testng.annotations.Test;

public class Demo4 {
	@Test
	public void WebLoginHomeLoan() {

		System.out.println("Web Login Home Loan");
	}
	@Test(groups = {"smoke"})
	public void MobileoginHomeLoan() {

		System.out.println("Mobile Login Home Loan");
	}
	@Test(dependsOnMethods= {"WebLoginHomeLoan", "MobileoginHomeLoan"})
	public void APILoginHomeLoan() {

		System.out.println("API Login Home Loan");
	}

}
