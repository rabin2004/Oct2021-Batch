package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfigurationFile {
	// Handling config file -
			// 1. Create instance of Properties class
			// 2. Read the config file - FileInputStream class -> get Apache Common IO jar file and import in project
			// 3. load all the data into properties class via instance/object reference name

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace"
				+ "\\Oct2021Batch\\src\\seleniumBasics\\config.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromeDriver"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// converting value from String to integer (as properties file will store all value in String only)
		String pageLoad = prop.getProperty("pageLoadTimeOut");
		int pageLoadInt = Integer.valueOf(pageLoad);
		String implicitWait = prop.getProperty("implicitWaitTimeOut");
		int implicitWaitInt = Integer.valueOf(implicitWait);
		
		driver.manage().timeouts().pageLoadTimeout(pageLoadInt, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(Integer.valueOf(prop.getProperty("pageLoadTimeOut")), 
//				TimeUnit.SECONDS); // can be type casting
		
		driver.manage().timeouts().implicitlyWait(implicitWaitInt, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();

		driver.close();
	}

}
