package javaBasics;

public class PrintingConcept {

	public static void main(String[] args) {
		// println() -> print in a line
		System.out.println("Hello Java for first time.");
		
		// print() -> print only
		System.out.print("hello again");

		System.out.println("hi from java");
		System.out.print("Welcome to java session");
		
		// println() -> can be kept blank
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Welcome to java session");
		
		// print() -> can't be left blank
//		System.out.print(); // will give error
		
		// shortcut -> System.out.println() => sysout ctrl+spacebar
		System.out.println("java");
		System.out.print("Java again");
		
		// print error message
		System.err.println("Try again!!");
		
		// print 2 statements
		System.out.println("Hello"+"Java"); // + => place operator
		System.out.println("Hello "+"Java");
		System.out.println("Hello"+" Java");
		System.out.println("Hello"+" "+"Java"); // good way
		
		// tab key space
		System.out.println("Hello"+"	"+"Java");
		System.out.println("Hello"+"\t"+"Java"); // good way
		System.out.println("Hello"+"\t\t"+"Java");
	}

}
