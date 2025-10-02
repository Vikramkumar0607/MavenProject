package testng.farmwork.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnontationOrderOfTestNG {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test(invocationCount = 1, timeOut = 100)
	public void testMethod() {
		System.out.println("test method");
	}

	@Test
	public void testMethod1() {
		System.out.println("test method1");
	}

	@Test
	public void testMethod2() {
		System.out.println("test method2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After  Test");
	}
}
