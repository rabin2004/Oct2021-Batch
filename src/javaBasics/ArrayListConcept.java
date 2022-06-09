package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	// ArrayList -> ArrayList class -> 1 dimensional

	public static void main(String[] args) {
		// creating instance/object of ArrayList class
			// new ArrayList() => object/instance of ArrayList class
			// al => reference name of the instance/object
			// ArrayList => class object/instance is referring to
		
//		ArrayList al = new ArrayList(); // non-parameterized
		ArrayList<String> al = new ArrayList<String>(); // parameterized
		
		// add() -> inserting data
		al.add("Cat"); // 1st row -> index 0
		al.add("Dog"); // 2nd row -> index 1
		al.add("Mouse");
		al.add("Elephant");
		
		// check number of rows
		System.out.println("Number of rows: "+al.size());
		System.out.println(al);
		
		// inserting value in a specific row
		al.add(1, "Rabbit"); // 2nd row -> index 1
		System.out.println("Number of rows: "+al.size());
		System.out.println(al);
		
		// remove() -> removing value from specific row
//		al.remove(1);
//		System.out.println(al);
		
		// clear() -> clearing values from arrayList
//		al.clear();
//		System.out.println(al);
		
		// isEmpty() -> to check if empty
//		System.out.println(al.isEmpty());
		
		// contains() -> check if the value is present in array or not
		System.out.println(al.contains("Donkey"));
		
		// clone() -> creating copy of arrayList
		Object al2 = al.clone();
		System.out.println(al2);
		
		// equals() -> comparing 2 arrayList, true->values same and in same order
		System.out.println(al.equals(al2));
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Cat");
		al3.add("Dog");
		al3.add("Mouse");
		al3.add("Elephant");
		al3.add("Rabbit");
		System.out.println(al.equals(al3));
		
		// indexOf() -> index of the value provided
		System.out.println("Dog is present at "+(al3.indexOf("Dog")+1)+" row.");
		System.out.println(al3.indexOf("Monkey")); // -1 => if value not present
		
		// get() -> extracts value out
		System.out.println(al3.get(3));
		
		// Traversing into arrayList
		// #1
//		for(int i=0; i<al3.size(); i++) {
//			System.out.println(al3.get(i));
//		}
		
		//#2
		int i=al3.size()-1;
//		while(i>=0) {
//			System.out.println(al3.get(i));
//			i--;
//		}
		
		// #3 -> for each loop
		for(String a: al3) {
			System.out.println(a);
		}
		
		// #4 -> iterator concept -> next() -> point to next value and extract it | hasNext() -> will check if next row is present or not
		Iterator<String> it = al3.iterator();
//		System.out.println("First row: "+it.next());
//		System.out.println("Second row: "+it.next());
//		System.out.println("Third row: "+it.next());
//		System.out.println("Fourth row: "+it.next());
//		System.out.println(it.hasNext());
//		System.out.println("Fifth row: "+it.next());
//		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	// Assignment: Create ArrayList with customer name and allow then to login (2D array) only for right customer
}
