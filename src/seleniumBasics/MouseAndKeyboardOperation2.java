package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardOperation2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.delta.com/");
		
		Actions action = new Actions(driver);
		WebElement travelInfoLink = driver.findElement(By.linkText("Travel Info"));
		Thread.sleep(3000);
		action.moveToElement(travelInfoLink).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.linkText("Gift Cards"))).click().build().perform();
		Thread.sleep(3000);
		
		String expectedGiftCardPageUrl = "https://www.delta.com/us/en/gift-cards/overview";
		String actualGiftCardPageUrl = driver.getCurrentUrl();
		if(actualGiftCardPageUrl.equals(expectedGiftCardPageUrl))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");

		WebElement searchIcon = driver.findElement(By.xpath("//ngc-search[contains(@class,'d-none d-lg')]"));
		
		Thread.sleep(3000);
		action.moveToElement(searchIcon).click().build().perform();
		Thread.sleep(3000);
		WebElement searchTxtField = driver.findElement(By.id("search_input"));
		action.moveToElement(searchTxtField).click().sendKeys("Testing")
		.build().perform();	
		
		Thread.sleep(3000);
		action.moveToElement(searchTxtField).doubleClick().build().perform();
		Thread.sleep(3000);
		action.click().doubleClick().sendKeys("Corona Testing").build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Coronavirus Testing Locations"))).click()
		.build().perform();
		Thread.sleep(3000);
		
		// Keyboard operation
		for(int i=1; i<=6; i++) {
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
		}
		
		action.moveToElement(driver.findElement(By.linkText("Website Feedback"))).build().perform();
		
		for(int i=1; i<=6; i++) {
			action.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
		}
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='selected-nav-item d-sm-none d-md-block']")))
		.doubleClick().build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
