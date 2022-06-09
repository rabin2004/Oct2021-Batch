package javaBasics;

public class DataTypeConcept {

	public static void main(String[] args) {
		// login in application -> username/password (data) -> check (database data) -> if matched login successful -> if not login fails

		// Types of Data: 	1. Primitive Data Types (predefined)			2. Class Reference/Object Data types (separate class to refer to)
		
		// Primitive DataType:
			// 1. Numerical DataTypes:
				// byte: small whole numbers, +/-
				// short: big whole numbers than byte, +/-
				// int: (integer) big whole numbers than short, +/-
				// long: big whole numbers than int, +/-, -> at the end of data need to used 'l' or 'L'
				// float: small decimal numbers, +/-, -> at the end of data need to used 'f'
				// double: big decimal numbers, +/-, -> at the end of data need to used 'D'
			
			// 2. Non-Numerical DataTypes:
				// boolean: "true" or "false" value
				// char: (character) single character can be alphabetic or numerical, has to be inside single quotation -> ''
		
		// Class Reference/object DataTypes:
				// String: handles anything (numerical, alphabetic, special characters, spaces or combination of any of these), should be in double quotation -> ""
		
		
		// Creating data -> Creating Variables => 1. DataType	2. Reference Name	3. value/data assigned
		
		byte byteData = 5;
		System.out.println(byteData);
		short shortData = 50;
		System.out.println(shortData);
		int intData = 500;
		long longData = 5000L;
		float floatData = 1.5f;
		double doubleData = 1.555D;
		
		boolean booleanTrueData = true;
		boolean booleanFalseData = false;
		char charNumericalData = '1';
		char charAlphaData = 'H';
		
		String stringData = "aa11$$   bb22&&&";
		System.out.println(stringData);
	}

}
