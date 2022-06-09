package javaBasics;

public class AccessingFromSamePkg {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
		//public access
		amc.addition();
		amc.addition(20, 30);
		// private access
//		amc.printingCustomerName("Tommy"); - can't access
		// default access
		amc.maritalStatus(false);
		// protected access
		amc.annualSalary(90000, 5000);

	}

}
