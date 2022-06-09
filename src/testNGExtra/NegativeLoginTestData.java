package testNGExtra;

import org.testng.annotations.DataProvider;

public class NegativeLoginTestData {

	@DataProvider(name="Negative Login Data")
	public String[][] negativeLoginData() {
		String[][] testData = {{"thomas1234","12345"},{"david1234","12345"}};
		return testData;
	}
}
