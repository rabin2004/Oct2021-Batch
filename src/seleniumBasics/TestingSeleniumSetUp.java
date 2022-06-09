package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSeleniumSetUp {

	public static void main(String[] args) {
		// 1. Setting system property with chrome driver key and path
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe"); // no extension, no \\ required
		
		// 2. Creating instance/object of ChromeDriver referring to WebDriver
		WebDriver driver = new ChromeDriver();
		
		// 3. load the application
		driver.get("https://www.amazon.com");

	}

}
