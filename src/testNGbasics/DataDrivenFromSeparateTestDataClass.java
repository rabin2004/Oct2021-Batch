package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenFromSeparateTestDataClass {

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
	
	// if data defined in different class but of same package: -> dataProviderClass = "className.class", dataProvider="methodName"
	// if data defined in different class from different package: -> dataProviderClass = "pkgName.className.class", dataProvider="methodName"
	
	@Test(dataProviderClass = PositiveLoginTestData.class, dataProvider="positiveLoginData", groups={"Integration Test","Regression Test"})
	public void positiveLoginFunctionalityTestByClickingSubmitBtn(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		WebElement loginSuccessMsg = driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td/h3"));
		String actualLoginSuccessMsg = loginSuccessMsg.getText();
		String expectedLoginSuccessMsg = "Login Successfully";
		Assert.assertEquals(actualLoginSuccessMsg, expectedLoginSuccessMsg);
	}
	
	@Test(dataProviderClass = testNGExtra.NegativeLoginTestData.class, dataProvider="Negative Login Data", groups={"Sanity Test","Regression Test"})
	public void negativeLoginFunctionalityTestByClickSubmitBtn(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		WebElement loginErrorMsg = driver.findElement(By.xpath("//td[@width='112']/span"));
		Assert.assertTrue(loginErrorMsg.isDisplayed());
	}
}
