package javaBasics;

public class StaticVsNonStaticConcept {
	
	// Static Vs Non-Static => properties -> method & variable
		// static -> closely related to the class
		// Non-static -> closely connected with instance/object of the class, if no static keyword
	
	// static to non-static mismatch -> 
		// 1. Non-static variable can be accessed by non-static method directly (not allowed to access non-static variable in static method directly)
		// 2. Static variable can be accessed by non-static method and static method directly
		// 3. static variable can only be accessed by non-static method by instance/object reference name of the class
		// 4. Static properties can also be accessed by className
		// 5. Non-static properties can also be accessed by class object/instance reference name
	
	// non-static or instance variable
	String name;
	// static or class variable
	static int age;
	
	void  printingCustomerName() { // non-static method
		name = "Tom";
		System.out.println(name);
		age = 30;
		StaticVsNonStaticConcept.age = 55;
		System.out.println(age);
		System.out.println(StaticVsNonStaticConcept.age);
	}
	
	static void pritingCustomerAge() { // static method
//		name = "Thomas";
		StaticVsNonStaticConcept svn = new StaticVsNonStaticConcept();
		svn.name = "Thomas";
		System.out.println(svn.name);		
		age = 40;
		StaticVsNonStaticConcept.age = 65;
		svn.age = 75;
		System.out.println(age);
	}
	
	public static void main(String[] args) { // main method is default static
		StaticVsNonStaticConcept svs = new StaticVsNonStaticConcept();
		// static properties calling
		pritingCustomerAge(); // #1 - direct calling
		StaticVsNonStaticConcept.pritingCustomerAge(); // #2 - className
		svs.pritingCustomerAge(); // #3 - object reference name
		age = 10;
		StaticVsNonStaticConcept.age = 20;
		svs.age = 30;
		System.out.println(age);
		
		// non-static properties calling
//		printingCustomerName(); // direct calling -> not allowed
//		StaticVsNonStaticConcept.printingCustomerName(); // className -> not allowed
		svs.printingCustomerName(); // object reference name -> only allowed

	}

}
