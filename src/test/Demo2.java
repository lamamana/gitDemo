package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@AfterTest
	public void Demo() {
		
		System.out.println("I will execute last test3");
	}
	
@Test(groups = {"smoke"})
public void testDemo() {
	
	System.out.println("test3");
}

@BeforeTest
public void prerequiste() {
	
	System.out.println("I will execute first");
}
@BeforeMethod
public void beforeMethod() {
	
	System.out.println("I will execute before every test method");
}
@AfterMethod
public void afterMethod() {
	
	System.out.println("I will execute after every test method");
}
}
