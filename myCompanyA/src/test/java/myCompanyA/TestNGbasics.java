package myCompanyA;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import frameWork.ActionsUtil;

public class TestNGbasics {
	
	WebDriver driver;

	// We have 9 different annotations;

	// BeforeSuit--->>Triggers code before any suite is triggered
	// AfterSuit--->>Triggers code after any suite is triggered
	// BeforeTest-->>Triggers code before any test case is triggered
	// AfterTest-->>Triggers code after any test case is triggered
	// BeforeClass-->Triggers code before any test Case is triggered
	// AfterClass-->>Triggers code after any test case is triggered
	// BeforeMethod-->>Triggers code before any test method is triggered/called
	// AfterMethod-->>Triggers code after any test method is triggered
	// @Test-->>We write test case logic here

	@BeforeSuite
	public void beforeTestSuiteIsTriggered() {

		System.out.println("Before Test Suite is Triggered");
	}

	@AfterSuite
	public void afterTestSuiteIsTriggred() {

		System.out.println("After Test Suite is Triggered");
	}

	@BeforeTest
	public void BeforeTestExecution() {

		System.out.println("Before Test Execution is Triggered");
	}
	
	@AfterTest
	public void AfterTestExecution() {

		System.out.println("After Test Execution is Triggered");
	}
	
	@BeforeClass
	public void BeforeClassExecution() {

		System.out.println("Before Test Class is Triggered");
	}
	
	@AfterClass
	public void AfterClassExecution() {

		System.out.println("After Test Class is Executed");
	}
	@Parameters("URL")
	@BeforeMethod
	public void BeforeMethodExecution(String url) {
		
		driver=ActionsUtil.getDriver();
		driver.get(url);

		System.out.println("Before Test Method is Executed");
	}
	
	@AfterMethod
	public void AfterMethodExecution() {

		System.out.println("After Test Method is Executed");
	}
	// invocationCount = 2-->>>This Test Case will iterate 2x 
	@Test(priority=1,description= "First Test Case", invocationCount = 2, suiteName="Sanity")
	public void FirstTestCase() {
		System.out.println("First Test Case");
	}
	// dependsOnMethods ="FirstTestCase"= Method Two Depends on Method One, Eg-->>Search Product Depends On Login
	// invocationCount = 2-->>>This Test Case will iterate 3x 
	@Test(priority=2,description= "Second Test Case",invocationCount = 3, suiteName="Regression", dependsOnMethods ="FirstTestCase")
	public void SecondTestCase() {

		System.out.println("Second Test Case");
	}
	//, expectedExceptions=Exception.class// when we are expecting exception at class level
	@Test(priority=3,description= "Third Test Case", invocationCount = 4)
	public void ThirdTestCase() {

		System.out.println("Third Test Case");
	}

}
