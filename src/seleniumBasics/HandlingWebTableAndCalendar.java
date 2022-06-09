package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableAndCalendar {
	// webTable -> identify the root table -> td=>cell & tr=>row 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
//		String offer1 = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[1]/font")).getText();
//		String offer1Amt = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[2]/div/font")).getText();
//		
//		System.out.println(offer1+"\t"+offer1Amt);
		
		// working with common Table structure
		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
		
//		String offer1 = offerTable.findElement(By.xpath("//tr[1]/td[1]/font")).getText();
//		System.out.println(offer1);
		
//		for(int i=1; i<=5; i++) {
//			String valueI = Integer.toString(i);
//			String offerXpath = "//tr["+valueI+"]/td[1]/font";
//			String offer = offerTable.findElement(By.xpath(offerXpath)).getText();
//			System.out.println("Offer "+i+": "+offer);
//		}
//		
//		for(int i=1; i<=5; i++) {
//			String valueI = Integer.toString(i);
//			String offerAmtXpath = "//tr["+valueI+"]/td[2]/div/font";
//			String offerAmt = offerTable.findElement(By.xpath(offerAmtXpath)).getText();
//			System.out.println(offerAmt);
//		}
		
		System.out.println("OFFER"+"\t\t\t\t\t\t"+"AMOUNT");
		System.out.println("-----------------------------------------------------");
		for(int i=1; i<=5; i++) {
			String valueOfferI = Integer.toString(i);
			String offerXpath = "//tr["+valueOfferI+"]/td[1]/font";
			String offer = offerTable.findElement(By.xpath(offerXpath)).getText();
			
			String valueOfferAmtI = Integer.toString(i);
			String offerAmtXpath = "//tr["+valueOfferAmtI+"]/td[2]/div/font";
			String offerAmt = offerTable.findElement(By.xpath(offerAmtXpath)).getText();

			System.out.println(offer+"\t\t\t\t"+offerAmt);
		}
		
		
		// Handling Calendar
		driver.get("https://www.timeanddate.com/calendar/");
		
		// Jan Month
		WebElement janMonth = driver.findElement(By.xpath("//table[@id='mct1']/tbody/tr[2]/td[1]/table/tbody"));
		
		String fifthJan = janMonth.findElement(By.xpath("//tr[3]/td[4]")).getText();
		System.out.println("January: "+fifthJan);
		
		String expectedtThirtyFirstJan = "31";
		String actualThirtyFirstJan = janMonth.findElement(By.xpath("//tr[7]/td[2]")).getText();
		if(actualThirtyFirstJan.equals(expectedtThirtyFirstJan)) {
			System.out.println("Got right date.");
		}else {
			System.out.println("Wrong Day");
		}
		
		String dateToBeSelected = "31";
		
		for(int i=2; i<=7; i++) {
			for(int j=1; j<=7; j++) {
			String row = Integer.toString(i);
			String column = Integer.toString(j);
			String desiredDate = janMonth.findElement(By.xpath("//tr["+row+"]/td["+column+"]")).getText();
			if(desiredDate.equals(dateToBeSelected)) {
				System.out.println(desiredDate);
				break;
			}
			}
		}
		
		driver.close();

	}
	// Assignment: 
		// 1. Create dataBase table to store offer text and offeAmount | Create verification point to compare between expected and actual offer text and offer amount
		// 2. Extract 1-2 days of each month | Create logic to identify date provided in couple of of month
}
