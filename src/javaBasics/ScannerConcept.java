package javaBasics;

import java.util.Scanner;

public class ScannerConcept {
	// Scanner concept -> 1. Create instance/object of Scanner class 	2. scan the user input 	3. using the user input into built in logic

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = scan.nextLine(); // to accept String datatype => next() & nextLine()
		
		// logic
		String firstLetter = firstName.substring(0, 1);
		String afterFirstLetter = firstName.substring(1).toLowerCase();
		String uppercasedFirstLetter = firstLetter.toUpperCase();
		String newFirstName = uppercasedFirstLetter.concat(afterFirstLetter);
		System.out.println("Welcome "+newFirstName+"!");
		
		for(int i=firstName.length()-1; i>=0; i--) {
			System.out.print(firstName.charAt(i));
		}
	}
	
	// Assignment: 	1. "aka" and "AKA" => disregarding casing => check values are same or not.
				//	2. Reversing string -> with StringBuffer/StringBuilder and without it.
				//	2. "lay" and "ayl" => have same character and number of character -> they are same.

}
