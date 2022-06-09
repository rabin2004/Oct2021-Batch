package javaBasics;

public class ConditionConcept {
	// Conditions: E.g Amazon search feature: -> apple 	-> either(if) -> 100 products 
													//	-> or(else) -> Error message "No product found"
											// -> banana 	-> if -> 200 products
													//		-> else if -> any related 50 products
													//		-> else -> "No product found"
											// -> orange	-> if -> 100 products
															//		=> execute whatever code
	
		// 1. if(condition1) {code} -> condition fulfilled code gets executed , condition not fulfilled code will not execute
		// 2. else if (condition2) {code} -> condition fulfilled code gets executed , condition not fulfilled code will not execute
		// 3. else {code} -> code will execution only "if" condition is not fulfilled and/or "else if" condition is not fulfilled
	

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int c = a+b;
		c = a*b;
		c = a-b;
		
		int control = -10;
//		if(c==control) {
//			System.out.println("Added value is equal to control");
//		}
//		else {
//			System.out.println("Added value is not equal to control");
//		}
//		System.out.println("Outside if block");
		
//		if(c==control) {
//			System.out.println("Product of a & b is equal to control");
//		}
//		else if(c>control) {
//			System.out.println("Product of a & b is greater than control");
//		}
//		else if(c<control) {
//			System.out.println("Product of a & b is less than control");
//		}
//		else {
//			System.out.println("Some value is invalid");
//		}
		
		// comparing more condition in a block -> (Condition1 Condition2) 1. && (both conditions need to fulfilled)	2. || (either or, fulfillment of one condition is enough)
			// E.g Login feature -> username & password -> for login to happen both should be valid 
			// E.g Parking ticket -> License plate, ticket number -> display ticket
		 
//		if(c<control || c>control) {
//			System.out.println("Substracted value is not equal to control");
//		}
//		else {
//			System.out.println("Substracted vallue is equal to control");
//		}
		
		if(a==b && b==c) {
			System.out.println("All 3 values are same");
		}
		else if(a<b && b<c) {
			System.out.println("c is largest value");
		}
		else if (b<c && c<a) {
			System.out.println("a is largest value");
		}
		else if(c<a && a<b) {
			System.out.println("b is largest value");
		}
	}

//	Assignment: // Login feature -> username & password -> for login to happen both should be valid 
				// Parking ticket -> License plate, ticket number -> display ticket
}
