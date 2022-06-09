package javaBasics;

public class StringManipulation {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 10;
//		System.out.println(a==b);
		
		String x = "man";
		String y = "man"; // option #1 creating string variable
		String z = new String("man"); // option #2 creating string variable
		String t = "MAN";
		
//		System.out.println(x==y); // these comparative operator -> only for numerical values
		
		// equals() -> comparing Strings, boolean, case sensitive
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(t)); // false
		// equalsIgnoreCase() -> not case sensitive
		System.out.println(x.equalsIgnoreCase(t)); // true
		
		// compareTo() -> comparing Strings, case sensitive, integer output, if output is 0 -> same string | if output is other than 0 -> different string
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(t)); // 32
		// compareToIgnoreCase() -> not case sensitive
		System.out.println(x.compareToIgnoreCase(t));
		
		x = "Apple is red.";
		y = "Banana is yellow and I like banana.";
		// length() -> to check size of string
		System.out.println("Number of characters in x: "+x.length());
		System.out.println("Number of characters in y: "+y.length());
		
		// indexOf() -> index/position of a character, first occurrence of the character
		System.out.println("Position of r: "+x.indexOf('r'));
		System.out.println("Position of e: "+x.indexOf('e'));
		
		// indexOf(0, 0) -> multiple occurrence of a character
		System.out.println("First occurrence of a: "+y.indexOf('a'));
//		System.out.println("Second occurrence of a: "+y.indexOf('a', 2));
		System.out.println("Second occurrence of a: "+y.indexOf('a', y.indexOf('a')+1));
		System.out.println("Third occurrence of a: "+y.indexOf('a', y.indexOf('a', y.indexOf('a')+1)+1));
		System.out.println("last occurrence of a: "+y.lastIndexOf('a'));
		
		// lastIndexOf() -> last occurrence of the character
		System.out.println("Last index of p: "+x.lastIndexOf('p'));
		
		// charAt() -> character at a particular index/position
		System.out.println("Character at index 5: "+y.charAt(5));
		
		// trim() -> remove blank space from front and back of string
		x = "    David      "; // Da       vid -> not handled by trim()
		y = "    T     ";
		System.out.println("Welcome "+x+" "+y+"!");
		x = x.trim();
		y = y.trim();
		System.out.println("Welcome "+x+" "+y+"!");
		
		x = "I am tried and hungry";
		// remove	
		System.out.println(x.replace(" ", ""));
		System.out.println(x.replace("a", ""));
				
		// concat() -> add to string
		y = "I am going to eat.";
		System.out.println(x+". "+y);
		System.out.println(x.concat(y));
		System.out.println(x.concat(". "+y));
		
		System.out.println(100+200+x);
		System.out.println(x+100+200);
		System.out.println(x+(100+200));
				
		// replace
		System.out.println(x.replace(" ", "_"));
		
		// substring() -> captures portion of string 
		System.out.println(x.substring(5));
//		x = "An Com";
//		int spaceIndex = x.indexOf(' ');
//		System.out.println("Last name: "+x.substring(spaceIndex));
		
		System.out.println(x.substring(5, 10));
		
		// isBlank() Vs isEmpty()
		x = ""; // empty
		y = " "; // not empty but blank
		System.out.println(x.isEmpty());
		System.out.println(y.isEmpty());
		System.out.println(y.isBlank());
	}

}
