package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	static WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}
	
	// Test case execution - alphabetic order -> change the sequence -> "priority" keyword
	// to ignore test case execution -> enabled=false-> ignore test case execution | default is enabled=true
	
	@Test(dataProvider="positiveLoginData", priority=0, groups={"Smoke Test","Regression Test"})
	public void positiveLoginFunctionalityTestByClickingSubmitBtn(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		String actualLoginSuccessMsg = loginSuccessMsg.getText();
		String expectedLoginSuccessMsg = "Login Successfully";
		Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
	}
	
	@Test(dataProvider="Negative Login Data", priority=1, enabled=false, groups={"E2E Test","Regression Test"})
	public void negativeLoginFunctionalityTestByClickSubmitBtn(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
	}
	
	// Data Driven Testing -> @DataProvider - create Data providing method | keyword - "dataProvider" used in test cases to establish connect | parameter in test method to push data accepted into the code
	
	@DataProvider
	public String[][] positiveLoginData() {
		String[][] testData = {{"test123","123"},{"test","123"},{"test12","123"}};
		return testData;
	}
	
	@DataProvider(name="Negative Login Data")
	public String[][] negativeLoginData() {
		String[][] testData = {{"thomas1234","12345"},{"david1234","12345"}};
		return testData;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
