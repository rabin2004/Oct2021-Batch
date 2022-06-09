package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDOmHandlingWebElement {
//	Search Txt field/box: -> TagName | attribute | value
//	<input id="twotabsearchtextbox" name="field-keywords" class="nav-input nav-progressive-attribute">
//		TagName => input
//		Attribute => id/name/class
//		value => twotabsearchtextbox | field-keywords | nav-input nav-progressive-attribute

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize window size
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		// Identifying webElement
		// text bod -> ID strategy
//		String item = "apple";
//		WebElement searchTxtBox = driver.findElement(By.id("twotabsearchtextbox"));
//		searchTxtBox.sendKeys(item);
//		Thread.sleep(2000);
		
		// Button/tab -> ID strategy
//		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
//		searchBtn.click();
		
		// creating verification point
		// capturing page title
//		String pageTitle = driver.getTitle();
//		System.out.println(item+" "+"Search Page title: "+pageTitle);
		// capturing page url
//		String pageUrl = driver.getCurrentUrl();
//		System.out.println(item+" "+"Search Page URL: "+pageUrl);

		// link/Menu -> linkText
		String link = "Amazon Basics";
//		link = "Today's Deals";
		WebElement menuLink = driver.findElement(By.linkText(link));
		menuLink.click();
		String actualPageTitle = driver.getTitle();
		System.out.println(link+" "+"Page title: "+actualPageTitle);
		String expectedPageTitle = "Amazon.com: "+link;
		System.out.println("Correct "+link+" "+"page title: "+actualPageTitle.equals(expectedPageTitle));
		
		// verification point
		if(expectedPageTitle.equals(actualPageTitle)) {
			System.out.println(link+" "+"Menu link functionality test: Passed");
		}else {
			System.err.println(link+" "+"Menu link functionality test: Failed");
		}
		
		// Flag icon
		driver.findElement(By.id("icp-nav-flyout")).click();
		Thread.sleep(3000);
		
		// radio button -> xpath/cssSelector (by copying xpath/selector) -> //*[@id="customer-preferences"]/div/div/form/div[1]/div[1]/div[2]/div
		WebElement spanishLangRadioBtn = driver.findElement(By.xpath
				("//*[@id='customer-preferences']/div/div/form/div[1]/div[1]/div[2]/div"));
		spanishLangRadioBtn.click();
		
		// text -> copying css selector
		WebElement langHeaderSpanish = driver.findElement(By.cssSelector("#lop-heading"));
		String langHeaderSpanishTxt = langHeaderSpanish.getText(); // extract text of a webElement
		System.out.println("Language header in Spanish: "+langHeaderSpanishTxt);
		
		Thread.sleep(3000);
		
		WebElement englishLangRadioButton = driver.findElement( By.xpath
				("//*[@id='customer-preferences']/div/div/form/div[1]/div[1]/div[1]/div"));
		englishLangRadioButton.click();
		
		// text -> copying css selector
		WebElement langHeaderEnglish = driver.findElement(By.cssSelector("#lop-heading"));
		String langHeaderEnglishTxt = langHeaderEnglish.getText(); // extract text of a webElement
		System.out.println("Language header in English: "+langHeaderEnglishTxt);
		
		
		Thread.sleep(5000); // pause execution 5 sec (5000 miliseconds)
		driver.close(); // closing the browser
	}
	
	// Assignment: 1. 10 object to search and verify title/url | 2. clicking on links and verifying title/url => verification point

}
