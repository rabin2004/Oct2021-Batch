package javaBasics;

public class MethodOverloading {
	
	// Method overloading VS Method Overriding
	
	// Method overloading -> creating methods with same methodName but with different number or types of parameter

		// duplicate method (method with same name and same number or type of parameter)
	void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	void addition(float a, float b) {
		System.out.println(a+b);
	}
	
	void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		
		mol.addition();
		mol.addition(23421, 3243, 224);
		mol.addition(1.33f, 4.776f);
		mol.addition(123223, 2424);

	}

}
