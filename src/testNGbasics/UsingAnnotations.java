package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingAnnotations {
	static WebDriver driver;
	
	// loading browser & closing browser for every method
//	@BeforeMethod
//	public void intializeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		driver.manage().deleteAllCookies();
//	}
	
//	@AfterMethod
//	public void closingBrowser() {
//		driver.close();
//	}
	
	// loading & closing browser once only
	@BeforeClass
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	@AfterMethod
	public void backToHomePage() {
		driver.findElement(By.linkText("Home")).click();
	}
		
	@Test
	public void positiveLoginFunctionalityTestByClickingSubmitBtn() {
		// pre-requisite code
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		driver.manage().deleteAllCookies();
		
		// test method specific code
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		String actualLoginSuccessMsg = loginSuccessMsg.getText();
		String expectedLoginSuccessMsg = "Login Successful!";
		Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
		
		// post-requisite cod
//		driver.close();
	}
	
	@Test
	public void positiveLoginFunctionalityTestByHittingEnterKey() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		String actualLoginSuccessMsg = loginSuccessMsg.getText();
		String expectedLoginSuccessMsg = "Login Successful!";
		Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
	}
	
	@Test
	public void negativeLoginFunctionalityTestByClickSubmitBtn() {
		driver.findElement(By.name("userName")).sendKeys("thomas12345");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
	}
	
	@Test
	public void negativeLoginFunctionalityTestByHittingEnterKey() {
		driver.findElement(By.name("userName")).sendKeys("thomas12345");
		driver.findElement(By.name("password")).sendKeys("12345");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
	}
	
	// Assignment: 5 features -> 5 classes -> Each class create pre-post requisite code using Annotations -> Each feature 3-4 test method

}
