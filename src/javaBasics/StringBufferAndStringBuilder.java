package javaBasics;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		String a = "Garry";
		
		// creating instance/object of StringBuffer class
		StringBuffer sb = new StringBuffer(a);
//		System.out.println(sb.reverse());
		
//		System.out.println(sb.delete(2, 4));
//		System.out.println(sb.deleteCharAt(2));
		
//		System.out.println(sb.append(" "+"M"));
		
		System.out.println(sb.insert(1, "a"));
		
		// Creating instance/object of StringBuilder class
		StringBuilder sbu = new StringBuilder(a);
//		System.out.println(sbu.reverse());
		
		sbu.setLength(3);
		System.out.println(sbu);

	}

}
