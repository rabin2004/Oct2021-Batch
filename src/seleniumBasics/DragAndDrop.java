package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
//		driver.findElement(By.id("draggable")); // NoSuchElementException -> since element is inside iframe
		
		// findElements() -> list of webElement
		// Handling iframe
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes: "+iframes.size());
		
//		driver.switchTo().frame(0); // -> index of the frame element
//		driver.switchTo().frame(iframes.get(0).getText()); // -> String value of the frame
		driver.switchTo().frame(iframes.get(0)); // -> webElement of the frame itself
		
		WebElement draggableObject = driver.findElement(By.id("draggable"));
		System.out.println("Is element found? "+draggableObject.isDisplayed());
		
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		
		// #1 drag & drop
		Actions action = new Actions(driver);
//		Thread.sleep(3000);
//		action.dragAndDrop(draggableObject, dropLocation).build().perform();
		
		// #2 drag & drop
		Thread.sleep(3000);
//		action.moveToElement(draggableObject).clickAndHold().build().perform();
		action.clickAndHold(draggableObject).build().perform();
		Thread.sleep(3000);
//		action.moveToElement(dropLocation).release().build().perform();
		action.release(dropLocation).build().perform();
		
		// #3 drag & drop
//		action.moveToElement(draggableObject).clickAndHold().moveToElement(dropLocation).release()
//		.build().perform();
		action.clickAndHold(draggableObject).release(dropLocation).build().perform();

		
		Thread.sleep(3000);
		driver.close();
	}

}
