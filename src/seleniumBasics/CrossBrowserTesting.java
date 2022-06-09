package seleniumBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
	static WebDriver driver;
	static Properties prop;

	public static void main(String[] args) throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Oct2021Batch\\"
				+ "src\\seleniumBasics\\crossBroswerConfig.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browserName");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromeDriver"));
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff")) {
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffDriver"));
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("internet explorer")) {
			System.setProperty(prop.getProperty("ieKey"), prop.getProperty("ieDriver"));
			driver = new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("edge") || browser.equalsIgnoreCase("ms edge")) {
			System.setProperty(prop.getProperty("edgeKey"), prop.getProperty("edgeDriver"));
			driver = new EdgeDriver();
		}
		else {
			System.err.println("Browser not supported.");
		}
		
		driver.manage().window().maximize();
		String pageLoad = prop.getProperty("pageLoadTimeOut");
		int pageLoadInt = Integer.valueOf(pageLoad);
		String implicitWait = prop.getProperty("implicitWaitTimeOut");
		int implicitWaitInt = Integer.valueOf(implicitWait);
		
		driver.manage().timeouts().pageLoadTimeout(pageLoadInt, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitWaitInt, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getTitle());

		driver.close();

	}

}
