package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckBoxAndDropDown {
	// Drop Down -> 1. Static		2. Dynamic 
		// 1. Static -> select tagName -> Select class -> click() -> then list appear -> to select -> a. visible Txt b. value c. index

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		// handling checkbox
		WebElement signInAccountList = driver.findElement(By.id("nav-link-accountList"));
		signInAccountList.click();
		
		String expectedSignInPageUrl = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&"
				+ "openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fref%3Dnav_ya_signin&"
				+ "openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&"
				+ "openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2"
				+ "Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs."
				+ "openid.net%2Fauth%2F2.0&";
		String actualSignInPageUrl = driver.getCurrentUrl();
		System.out.println(expectedSignInPageUrl);
		System.out.println(actualSignInPageUrl);
		if(expectedSignInPageUrl.equals(actualSignInPageUrl)) {
			System.out.println("SignIn Account & List link functionality test: Passed");
		}else {
			System.err.println("SignIn Account & List functionality test: Failed");
		}
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		WebElement rememberMe = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]"
				+ "/div[2]/div/div/div/form/div/div[2]/div/div/label/div/label/input"));
		rememberMe.click();
		Thread.sleep(2000);
		rememberMe.click();
		Thread.sleep(2000);
		rememberMe.click();
		
		driver.findElement(By.cssSelector("#a-page > div.a-section.a-padding-medium.auth-workflow > "
				+ "div.a-section.a-spacing-none.auth-navbar > div > a > i")).click();
		
		// Handling Static Drop down
		String txtToSelectFromSearchDropDown = "Alexa Skills";
		String valueToSelectFromSearchDropDown = "search-alias=amazonfresh";
		int indexToSelectFromSearchDropDown = 13;
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(searchDropDown);
		Thread.sleep(2000);
		select.selectByVisibleText(txtToSelectFromSearchDropDown);
		Thread.sleep(2000);
		select.selectByValue(valueToSelectFromSearchDropDown);
		Thread.sleep(2000);
		select.selectByIndex(indexToSelectFromSearchDropDown);
		
		Thread.sleep(2000);
		driver.close();
	}
	// Assignment: Handle all search drop down list -> using arrayList

}
