package seleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	// handling windows -> switchTo().window("window handles") -> to get window handle getWindowHanlde()/getWindowHandles()
		// getWindowHandle() -> window handle of a window in control
		// getWindowHandles() -> all window handle of windows opened by that browser instance

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().deleteAllCookies();

//		String parentWindowHandle = driver.getWindowHandle();
//		System.out.println("Parent window handle: "+parentWindowHandle);
		
		// switch to iframe
		WebElement iframeForElement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframeForElement);
		
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		// new window should open
//		String testingDriverControl = driver.getWindowHandle();
//		System.out.println(testingDriverControl);
//		System.out.println("Two handles are for same window: "+parentWindowHandle.equals(testingDriverControl));
		
		// Handling element in child window
//		driver.findElement(By.id("search2")).sendKeys("Testing");
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Number of window: "+handles.size());
		
		Iterator<String> it = handles.iterator();
//		System.out.println("Parent window handle: "+it.next());
//		System.out.println("Child window handle: "+it.next());
		String parentWindowHanlde = it.next();
		String childWindowHanlde = it.next();
		
		// switching window
		driver.switchTo().window(childWindowHanlde);
		driver.findElement(By.id("search2")).sendKeys("Testing");
		
		Thread.sleep(3000);
//		driver.close(); // closing window in control
		
		driver.switchTo().window(parentWindowHanlde);
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
//		driver.close();
		
		Thread.sleep(3000);
//		driver.quit(); // close all the window opened by browser instance
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> pointer = windowhandles.iterator();
		while(pointer.hasNext()) {
			driver.switchTo().window(pointer.next());
			System.out.println("Page Title for window opened: "+driver.getTitle());
			driver.close();
		}
	}

}
