package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatingDependency {

static WebDriver driver;
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	// dependency between test cases: -> dependsOnMethods ="methodName" -> failing of Test cases that it is depending on will lead to skipping of dependent Test case
	
	@Test
	public void registerLinkTest() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tour");
	}
	
	@Test(dependsOnMethods="registerLinkTest")
	public void registrationFunctionalityTest() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("email")).sendKeys("Test12");
		driver.findElement(By.name("submit")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/register_sucess.php");
	}
	
	
	
	
	
	
	
	
	
	
}
