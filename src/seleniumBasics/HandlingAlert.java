package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	// Alert message/Pop-up/Java pop-up: -> switchTo().alert()
										//	-> print txt of alert -> getText()
										//	-> accept/ok/True/CheckMark/Approve -> accept()
										//	-> deny/cancel/False/CrossMark -> dismiss()

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().deleteAllCookies();
		
		WebElement cusIDTxtField = driver.findElement(By.name("cusid"));
		cusIDTxtField.sendKeys("test12");
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();
		// alert should open -> if alert is not handled => UnhandledAlertException: unexpected alert open
//		WebElement resetBtn = driver.findElement(By.name("res"));
//		resetBtn.click();
		
		// Handle alert
		String alertMsg1 = driver.switchTo().alert().getText();
		System.out.println("First alert message: "+alertMsg1);
		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
//		String alertMsg2 = driver.switchTo().alert().getText();
//		System.out.println("Second alert message: "+alertMsg2);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.findElement(By.name("cusid")).sendKeys("test12");
//		WebElement resetBtn = driver.findElement(By.name("res"));
//		resetBtn.click();
		
		driver.switchTo().alert().dismiss();
		WebElement resetBtn = driver.findElement(By.name("res"));
		resetBtn.click();
		
		driver.close();
	}

}
