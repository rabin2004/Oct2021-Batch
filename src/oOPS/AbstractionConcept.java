package oOPS;

public abstract class AbstractionConcept { 
	// abstract class -> can handle abstract method as well as regular method, if abstract method is not present it is not going to throw error, can't create instance of an abstract class
	// Abstraction -> different class/method than regular
		// method created but unimplemented (method without body)
	
	// regular method
	void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	// abstract method -> can only be handled in abstract class
	abstract void substraction(int a, int b); 
	abstract void multiplication(int a, int b);
	abstract void division(int a, int b);
	
	// addition, subtraction, multiplication, division 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
