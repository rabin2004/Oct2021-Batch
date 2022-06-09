package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGscript {
	
	// to write automation script -> @Test -> under this test method will be created
	// Assertion -> to avoid creating verification point instead assertion allows to create validation point
		// 1. assertEquals(actualResult, expectedResult): actual=expect: pass | actual not= expect: fail
		// 2. assertTrue(condition): TrueCondition: pass | FalseCondition: fail
		// 3. assertFalse(condition): FalseCondition: pass | TrueCondition: fail
	
	// Verification point Vs Validation point ????

	@Test
	public void positiveLoginFunctionalityTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		String actualLoginSuccessMsg = loginSuccessMsg.getText();
		String expectedLoginSuccessMsg = "Login Successful!";
		// verification point
//		if(loginSuccessMsg.isDisplayed()) {
//			System.out.println("Positive Login Functionality Test: Passed");
//		}
//		else {
//			System.err.println("Positive Login Functionality Test: Failed");
//		}
//		System.out.println("After verification point");
		
		// validation point -> expected Vs actual result
		Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
		// Console output:
		// FAILED: positiveLoginFunctionalityTest
		// java.lang.AssertionError: expected [Login Successful!] but found [Login Successfully]
	
		driver.close();
	}
	

	@Test
	public void negativeLoginFunctionalityTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("userName")).sendKeys("thomas12345");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		// verification point
//		if(loginErrorMsg.isDisplayed()) {
//			System.out.println("Negative Login Functionality Test: Passed");
//		}
//		else {
//			System.err.println("Negative Login Functionality Test: Failed");
//		}
		
		Assert.assertTrue(loginErrorMsg.isDisplayed());
		
//		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
//		Assert.assertFalse(loginSuccessMsg.isDisplayed());
	
		driver.close();
	}
}
