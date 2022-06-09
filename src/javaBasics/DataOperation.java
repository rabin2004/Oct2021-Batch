package javaBasics;

public class DataOperation {
	
	// Data operation: 
		// 1. Mathematical/Arithmetic operation: -> maths -> +,-,*,/ -> numerical output
		// 2. Comparative Operation: -> comparing -> boolean output "true" or "false"
				// Comparative operators:
					// == -> equals to
					// != -> not equal to
					// > -> more than
					// >= -> more than or equal to
					// <= -> less than or equal to

	public static void main(String[] args) {
		// 1. Mathematical/Arithmetic operation:
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		
		int c = a+b;
		System.out.println(c);
		
		c = a-b; // reusing reference name 'c' => replace value assigned to 'c'
		System.out.println(c);
		
		c = a*b;
		System.out.println(c);
		
		c = a/b; // actual value => 0.5
		System.out.println(c);
		
		float a1 = 10;
		float b1 = 20;
		float c1 = a1/b1;
		System.out.println(c1);
		System.out.println(a1);
		
		double tempFarenheit = 50;
		double tempCelsius = (tempFarenheit-32)*5/9;
		System.out.println(tempCelsius);

		
		// 2. Comparative Operation:
		int x = 50;
		int y = 100;
		int z = 150;
		int f = 100;
		
		System.out.println(y==f); // true
		System.out.println(x==y); // false
		
		System.out.println(x!=y); // true
		System.out.println(y!=f); // false
		
		System.out.println(x>y); // false
		System.out.println(z>f); // true
		
		System.out.println(z>=f); // true
		System.out.println(y>=f); // true
		
		System.out.println(x<=y); // true
		System.out.println(y<=f); // true
	}

}
