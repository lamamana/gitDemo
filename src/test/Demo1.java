package test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {

	// public static void main(String[] args) {
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("testDemo1");
		System.out.println("testDemo2");
		System.out.println("testDemo3");
	}

	@Test(timeOut=4000)
	public void test2() {

		System.out.println("test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {

		System.out.println("test3");
		Assert.assertTrue(false);
	}
	
	@BeforeSuite
	public void firstSuite() {

		System.out.println("i am no. first");
	}
	
	@AfterSuite
	public void lastSuite() {

		System.out.println("i am no. last");
	}
}
