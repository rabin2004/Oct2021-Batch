package javaBasics;

public class ObjectVariableMethodConcept {
	
	// Object -> anything that has state & behavior (properties) => creating object of a class
		// state & behavior -> properties 
			// state => variables
			// behavior => methods/functions
	
	// creating variables
	int wheel = 4;
	String model = "BMW";
	int door = 2;
	
	public void carInfo() { // method
		System.out.println("Car info: "+"\n"+"Model Type: "+model+"\n"+"Number of wheels: "+wheel+
				"\n"+"Number of door: "+door);
	}

	public static void main(String[] args) {
		// Creating object/instance of the class: ClassName refName = new ClassName();
		ObjectVariableMethodConcept car = new ObjectVariableMethodConcept();
		// accessing/calling properties of the class
		System.out.println(car.wheel);
		System.out.println(car.model);
		
		car.carInfo();

	}

}
