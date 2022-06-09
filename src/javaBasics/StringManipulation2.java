package javaBasics;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String a = "Learning java is fun";
		
		
		// split() -> break string down into pieces
//		String[] brokenStringInWords = a.split(" ");
//		
////		System.out.println(brokenStringInWords[0]);
//		System.out.println("Number of words in string a: "+brokenStringInWords.length);
//		
//		for(int i=0; i<brokenStringInWords.length; i++) {
//			System.out.println(brokenStringInWords[i]);
//			if(brokenStringInWords[i].equals("is")) {
//				System.out.println("Is - is present in the string.");
//			}else
//				System.out.println("Is - not present ");
//		}
		
		a = "mIKE";
		// reverse String
//		System.out.println(a.charAt(4));
//		for(int i=a.length()-1; i>=0; i--) {
//			System.out.print(a.charAt(i));
//		}
		
		// toUpperCase() -> converting to uppercase
//		a = a.toUpperCase();
//		System.out.println("Welcome "+a+"!");
		
		// first letter uppercase and rest should be lowercase
		String firstLetter = a.substring(0, 1);
		String afterFirstLetter = a.substring(1).toLowerCase();
		String uppercasedFirstLetter = firstLetter.toUpperCase();
		String newFirstName = uppercasedFirstLetter.concat(afterFirstLetter);
		System.out.println("Welcome "+newFirstName+"!");
		
		// coverting to lowercase
//		a = "GARRY@GMAIL.COM";
//		a = a.toLowerCase();
//		System.out.println("Please confirm your email address provided is correct: "+a);
		 

	}

}
