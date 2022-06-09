package oOPS;

import java.util.Scanner;

public class UnderstandingEncapsulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EncapsulationConcept ec = new EncapsulationConcept();
		
		System.out.println("Enter SSN: ");
		String ssn = scan.next();
		ec.setSSN(ssn);
		System.out.println("Enter DOB(MM/DD/YYYY): ");
		String dob = scan.next();
		ec.setDOB(dob);
		scan.close();
		
		System.out.println("Details provided: ");
		System.out.println("SSN: "+ec.getSSN());
		System.out.println("DOB: "+ec.getDOB());

	}

}
