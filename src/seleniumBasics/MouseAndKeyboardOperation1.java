package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardOperation1 {
	// Mouse & KeyBoard operation -> AJAX interactions -> Actions class
	 // steps to be followed -> 	1. Create instance of Actions class -> pass driver
								//	2. WebElement to perform action on
								// 	3. decide action/s to be performed
								//	4. build the action & perform the action

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Actions action = new Actions(driver);
//		WebElement flagIcon = driver.findElement(By.cssSelector("#icp-nav-flyout"));
		
//		Thread.sleep(3000);
//		action.moveToElement(flagIcon).build().perform();
		
//		WebElement spanishLanOption = driver.findElement(By.partialLinkText("Esp"));
//		
//		
//		System.out.println("English Home page title: "+driver.getTitle());
//		Thread.sleep(3000);
//		action.moveToElement(spanishLanOption).click();
//		System.out.println("Spanish Home page title: "+driver.getTitle());
		
//		WebElement changeCountryLink = driver.findElement(By.partialLinkText("Change country"));
//		action.moveToElement(driver.findElement(By.partialLinkText("Change country"))).click().build().perform();
		
//		action.moveToElement(flagIcon).moveToElement(driver.findElement(By.partialLinkText("Change country")))
//		.click().build().perform();
		
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(accountList).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Account"))).click().build().perform();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();
	}

}
