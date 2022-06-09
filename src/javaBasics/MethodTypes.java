package javaBasics;

public class MethodTypes {
	// method/function -> behavior
	
	// Basic requirement to create method -> 	
						//	1. return type(if returning nothing "void" keyword needs to be used)
						//	2. method signature -> methodName()
						// 	3. method body/block -> {method body}
	
	void test() { // method/ non-parameterized method
		System.out.println("Different method");
	}
	
	// Parameter -> creating variable(dataType & referenceName only) inside method signature
	void test2(String a) { // parameterized method, single parameter
		System.out.println(a);
	}
	
	void test3(int a, int b) { // parameterized method, multiple parameter (same dataType or different)
		int c = a+b;
		System.out.println(c);
	}
	
	void studentInfo(String name, int age, boolean married, double salary, String ssn) {
		System.out.println("Name: "+name.toUpperCase());
		System.out.println("Age: "+age);
		System.out.println("Married: "+married);
		System.out.println("Salary: "+salary);
		System.out.println("SSN: "+" "+"*****"+ssn.substring(5));
	}
	
	

	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		mt.test();
		
		mt.test2("Same method"); // parameterized method needs to be satisfied with corresponding argument
		mt.test2("lots of method");
		mt.test();
		
		mt.test3(431243, 32432);
		mt.test3(129, 86213);
		
		mt.studentInfo("David M.", 39, true, 100000, "123456789");
	}

}
