package javaBasics;

import java.util.Scanner;

public class ReturnTypeConcept {
	
	// Return type -> method returning value
	
	String intials(String firstName, String lastName) { // David Murphy -> intials DM
		String firstNameInitial = firstName.substring(0,1).toUpperCase();
		String lastNameInitial = lastName.substring(0,1).toUpperCase();
		String customerIntial = firstNameInitial.concat(lastNameInitial);
		return customerIntial;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = scan.next();
		System.out.println("Enter last name: ");
		String lastName = scan.next();
		scan.close();
		
		ReturnTypeConcept rtc = new ReturnTypeConcept();
		System.out.println("Intial to be used: "+rtc.intials(firstName, lastName));

	}
	
	// All assignment needs to be converted in this format

}
