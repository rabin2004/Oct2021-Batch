package testNGbasics;

import org.testng.annotations.DataProvider;

public class PositiveLoginTestData {

	@DataProvider
	public String[][] positiveLoginData() {
		String[][] testData = {{"test123","123"},{"test","123"},{"test12","123"}};
		return testData;
	}
	
}
