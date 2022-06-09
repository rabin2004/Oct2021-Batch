package javaBasics;

public class ArrayConcept2D {
	// 2D array -> multiple rows & multiple column

	public static void main(String[] args) {
		// creating 2D
		String[][] customerName = new String[5][2]; // [5] => Number of rows | [2] => number of columns
		
		// inserting value
		// 1st row
		customerName[0][0] = "John";
		customerName[0][1] = "T";
		// 2nd row
		customerName[1][0] = "David";
		customerName[1][1] = "Y";
		// 3rd row
		customerName[2][0] = "Mary";
		customerName[2][1] = "K";
		// 4th row
		customerName[3][0] = "Tisha";
		customerName[3][1] = "P";
		// 5th row
		customerName[4][0] = "Mach";
		customerName[4][1] = "A";
		
		// extract value
//		System.out.println(customerName[4][0]);
//		
//		int rowCount = customerName.length;
//		System.out.println("Number of rows: "+rowCount);
//		
//		int columnCount = customerName[0].length;
//		System.out.println("Number of columns: "+columnCount);

		for(int i=0; i<customerName.length; i++) { // traversing rows
//			System.out.println("Number of rows "+(i+1));
			for(int j=0; j<customerName[i].length; j++) { // traversing columns
//				System.out.println("Number of columns "+(j+1));
				System.out.println(customerName[i][j]);
			}
		}
	}
	
	// Assignment: 	1. Extract values of same row in same line with single tab space
				//	2. Traversing through 2D array using while loop
				//	3. Use conditions -> Create 2D array with username & password-> create a logic to validate credentials to allow/deny login

}
