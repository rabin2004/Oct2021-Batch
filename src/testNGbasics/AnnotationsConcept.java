package testNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsConcept {
	// Annotations: 
				// 1. @Test -> to create test method
				// 2. Pre-requisite annotations -> start with @Before (@BeforeMethod, @BeforeClass, @BeforeTest, @BeforeGroups, @BeforeSuite)
				// 3. Post-requisite annotations -> start with @After (@AfterMethod, @AfterClass, @AfterTest, @AfterGroups, @AfterSuite)

		// @BeforeMethod & @AfterMethod -> code to be executed before and after every test method
		// @BeforeClass & @AfterClass -> code to be executed before and after every class
		// @BeforeTest & @AfterTest -> Test => Test execution (multiple test method/s from multiple class/classes) -> code to be executed before and after every test execution
		// @BeforeSuite & @AfterSuite -> collection of Test execution => suite -> code to be executed before and after suite
		// @BeforeGroups & @AfterGroups -> test method can be tagged into different groups -> code to be executed before and after groups
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case - 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case - 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test case - 3");
	}
}

