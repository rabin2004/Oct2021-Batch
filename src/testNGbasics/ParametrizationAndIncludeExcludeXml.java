package testNGbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationAndIncludeExcludeXml {

	static WebDriver driver;
	
	// Parameterized XML 	-> 1. parameter tag in xml, define parameter in key & value pair
						//	-> 2. @Parameter (parameter1,parameter2....)
						//	-> 3. method parameter
	
	@Parameters({"chromeKey","chromePath","testURL"})
	@BeforeMethod(alwaysRun=true)
	public void initialization(String chromeKey, String chromePath, String URL) {
		System.setProperty(chromeKey, chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}

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
