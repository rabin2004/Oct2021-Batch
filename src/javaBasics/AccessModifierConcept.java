package javaBasics;

public class AccessModifierConcept {
	// access modifier for class => 1. public 			-> access (able to create instance) from same package and different package
								//	2. abstract ??	
								//	3. final			-> can access from same package but not from different package
	
	
	
	/// Access Modifier: on properties level
		// 1. public -> open for anybody anywhere -> can be accessed within the class, class from same pkg and different pkg
		// 2. private -> can only be accessed within the class
		// 3. default -> can be accessed within the class, class from same pkg but not from different pkg -> subclass/child class can't access
		// 4. protected -> can be accessed within the class, class from same pkg but not from different pkg -> subclass/child class can access
	
		// default VS protected ->  ??
	
		// final ??
	
	public int a;
	public static int b;
	private String name;
	boolean married;
	protected double salary;
	final String customerStatus = "Active";
	
	public void addition() {
		a = 10;
		b = 20;
		System.out.println(a+b);
	}
	
	public static void addition(int a, int b) {
		AccessModifierConcept amc = new AccessModifierConcept();
		amc.a = a;
		AccessModifierConcept.b = b;
		System.out.println(amc.a+AccessModifierConcept.b);
	}
	
	private void printingCustomerName(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	
	void maritalStatus(boolean status) {
		married = status;
		System.out.println("Married: "+married);
	}
	
	protected void annualSalary(double salary, double bonus) {
		this.salary = salary;
		double totalSalary = this.salary+bonus;
		System.out.println("Annual salary: "+totalSalary);
	}
	
	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
//		amc.customerStatus = "Inactive"; // not allowed to reassign value
		System.out.println("Customer Status: "+amc.customerStatus);
		// public access
		System.out.print("Number of orders returned:");
		amc.addition();
		System.out.print("Total Number of orders: ");
		addition(20,30);
		
		System.out.println();
		
		// private access
		amc.printingCustomerName("Tommy");
		// default access
		amc.maritalStatus(false);
		// protected access
		amc.annualSalary(90000, 5000);
		

	}

}
