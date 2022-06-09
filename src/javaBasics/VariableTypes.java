package javaBasics;

public class VariableTypes {
	
	// Variable Types:
		// 1. Local variable -> created inside a method
		// 2. Instance variable -> created inside the class but outside any method, without keyword static
		// 3. Class variable -> created inside the class but outside any method, but with keyword static
	
	// Parameters ???
	
	String name = "David"; // instance variable - with value assigned
	int a; // instance variable - with value unassigned
	
	static String address = "123 New road"; // class variable - with value assigned
	static int b; // class variable - with value unassigned
	
	public void test() {
		String msg = "Hi"; // local variable
		System.out.println(msg);
		VariableTypes vt = new VariableTypes();
		System.out.println(vt.name);
	}

	public static void main(String[] args) {
		// accessing local variable
		String msg = "hello";
		System.out.println(msg);
//		String msg = "hello"; // Duplicate local variable not allowed
		
		// accessing instance variable
//		System.out.println(name); // static way of accessing is not allowed
		VariableTypes vt = new VariableTypes();
		System.out.println(vt.name); // instance variable can be accessed with instance/object reference name
		vt.a=10; // assigning value to instance variable
		System.out.println(vt.a);
		
		//accessing class variable - accessed in static way
		System.out.println(address);
		b = 100;
		System.out.println(b);
	}

}
