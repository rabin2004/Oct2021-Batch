package javaBasics;

public class LoopingConcept {
	// 3 requirement to create loop: 	-> 1. counter variable (start point)
									//	-> 2. condition (end point)
									//  -> 3. increment/decrement
	// Types of looping:
	// for loop: -> for(1; 2; 3){code}
	// while loop: -> 1; while(2){code; 3;}

	public static void main(String[] args) {
		// 1-100
//		int a = 1;
//		int b = 2;
//		int c = 3; //......100
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c); //.......100

		// for 
//		for(int i=1; i<=100; i=i+1) { // i=i+1 => i++
//			System.out.println(i);
//		}
		
		// while
//		int i = 1;
//		while(i<=100) {
//			System.out.println(i);
//			i=i+1;
//		}
		
		// 100-1
		//for
//		for(int i=100; i>=1; i=i-1) { // i=i-1 => i--
//			System.out.println(i);
//		}
		
		//while
		int i = 100;
		while(i>=1) {
			System.out.println(i);
			i=i-1;
		}
	}

	// Assignment: Print 1-1000 then 1000-1 using for/while. Print even and odd number between 1-1000 and 1000-1
}
