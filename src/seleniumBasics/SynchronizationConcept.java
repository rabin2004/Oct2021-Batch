package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	
	// Synchronization/wait -> concept creating sync in speed between application/webElement loading time 
						//	Vs automation script execution
	
		// 2 ways:
			// 1. Static wait -> non dynamic, pause automation script for defined amount of time with doing nothing -> Thread.sleep(5000);
			// 2. Dynamic wait -> waits for the element if not found for define amount of time, once found will continue execution
					// a. Implicit wait -> global wait -> defined once for all element
					// b . Explicit wait -> local wait/for specific element -> WebDriverWait
							
					// Fluent wait -> variation of Explicit wait -> frequency/polling of search
	
	// Explicit wait -> 20 -> 0-5-10-15-20
	// Fluent wait -> 20 -> 0-2-4-6-8-10-12-14-16-18-20

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		
		WebElement fashionLink = driver.findElement(By.linkText("Fashion"));
		fashionLink.click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		WebElement amazonBasicsLink = driver.findElement(By.linkText("Amazon Basics"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(amazonBasicsLink));
		amazonBasicsLink.click();
		
		driver.close();
	}

}
