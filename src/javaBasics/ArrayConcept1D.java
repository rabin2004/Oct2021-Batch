package javaBasics;

public class ArrayConcept1D {
	// Array Concept -> to handle Data table
		// 1D array -> one column multiple rows

	public static void main(String[] args) {
		// creating array
//		int[] arrayA = new int[8];
//		int arrayB[] = new int[5];
		
		// inserting data in 1D array -> Max index = Row-1
//		arrayA[0] = 10;
//		arrayA[1] = 20;
//		arrayA[2] = 30;
//		arrayA[3] = 40;
//		arrayA[4] = 50;
//		arrayA[5] = 60;
//		arrayA[6] = 70;
//		arrayA[7] = 80;
		
		int[] arrayA = {10,20,30,40,50,60,70,80,90,100};
		
 		// extracting data
//		System.out.println(arrayA[4]);
//		System.out.println(arrayA[1]);
//		System.out.println(arrayA[0]+arrayA[4]);
		
		// to get number of rows
//		System.out.println("Number of rows: "+arrayA.length);
		
		// extracting all values - using loop concept
//		for(int i=0; i<=4; i++) {
//			System.out.println(arrayA[i]);
//		}
//		for(int i=0; i<arrayA.length; i++) {
//			System.out.println(arrayA[i]);
//		}
		
//		int i = 0;
//		while(i<=4) {
//			System.out.println(arrayA[i]);
//			i++;
//		}
//		while(i<arrayA.length) {
//			System.out.println(arrayA[i]);
//			i++;
//		}
		
//		String[] name = {"Dave","Harry","Mike","Mark"};
//		for(int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}
//		int i = name.length-1;
//		while(i>=0) {
//			System.out.println(name[i]);
//			i--;
//		}
		
		// Looping & Condition concept:
		for(int i=0; i<arrayA.length; i++) {
			if(arrayA[i]==120) {
				System.out.println(arrayA[i]+" : "+"Right number.");
				break;
			}
			else {
				System.out.println("Wrong number.");
			}
		}
	}
	// Assignment: Practicing 1D-Array then traversing through it, using loop & conditions together.

}
