package javaBasics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapAndHashTableConcept {
	// HashMap & HashTable -> key value pair -> class to be instantiated

	public static void main(String[] args) {
		// Creating HashMap
//		HashMap hm = new HashMap(); // non-parameterized type/raw type
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); // <Key, Value>

		// inserting value
		hm.put(9, "Ronaldo"); // creating entry
		hm.put(10, "Messi");
		hm.put(11, "C.Ronaldo");
		hm.put(1, "Suarez");
		hm.put(5, "Bappe");
		
		// extract value
		System.out.println(hm.get(10));
		System.out.println(hm.get(5));
		
		System.out.println(hm);
		
		System.out.println(hm.keySet()); // all keys
		System.out.println(hm.values()); // all values
		System.out.println(hm.entrySet()); // key-value pair
		
//		hm.remove(1); // removes specific entry
//		System.out.println(hm);
//		hm.remove(11, "C.Ronaldo");
//		System.out.println(hm);
		
		System.out.println(hm.size()); // total number of entries
		
		// duplicate key
//		hm.put(5, "Beckham"); // replacing value
//		System.out.println(hm);
		
		// duplicate value
		hm.put(7, "Messi");
		System.out.println(hm);
		
		// Null key
//		hm.put(null, "Ronaldino");
//		System.out.println(hm);
//		System.out.println(hm.get(null));
//		hm.put(null, "Morales");
//		System.out.println(hm);
		
		// Null value
//		hm.put(99, null);
//		hm.put(88, null);
//		System.out.println(hm);
		
		// Null key & value
//		hm.put(null, null);
//		System.out.println(hm);
		
		// Creating Hashtable
		Hashtable<Character, String> ht = new Hashtable<Character, String>();
		// inserting value
		ht.put('A', "Banana");
		ht.put('Y', "Red");
		ht.put('M', "Donkey");
		
		System.out.println(ht);
		System.out.println(ht.get('Y'));
		System.out.println(ht.size());
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		System.out.println(ht.entrySet());
		// Null key
//		ht.put(null, "Morning"); // NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//		System.out.println(ht);
		
		// Null value
//		ht.put('T', null); // NullPointerException
//		System.out.println(ht);
		
		// Null key & value
//		ht.put(null, null); // NullPointerException
//		System.out.println(ht);
		
		ht.put('A', "Ballon"); // replacing value
		System.out.println(ht);
		
		ht.put('X', "Ballon");
		System.out.println(ht);
		

		// Traversing through HashMap/Hashtable	
		// #1 - for loop
		Object[] keys = ht.keySet().toArray();
//		for(int i=0; i<keys.length; i++) {
//			System.out.println(ht.get(keys[i]));
//		}
		// #2 - while loop
//		int i = 0;
//		while(i<keys.length) {
//			System.out.println(ht.get(keys[i]));
//			i++;
//		}
		// #3 - iterator
		Iterator<Character> it = ht.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(ht.get(it.next()));
		}
	}
	
	
	// Assignment: When student enter studentID -> should be able to extract their information
				// 1. Create 2D Array to record Student information | 1D Array For StudentID
				// 2. Create HashMap/Hashtable to create entry for each student, key=StudentID and value student info
				// 3. List of StudentID key as data table and use it for extracting each student information

}
