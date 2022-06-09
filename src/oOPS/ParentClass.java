package oOPS;

public class ParentClass extends GrandParent{
	
	protected int a;
	static int b;
	
	public void childClassMethod() {
		super.childClassMethod();
		System.out.println("Parent class");
	}
	
	public static void addition1(int a, int b) {
		ParentClass pc = new ParentClass();
		pc.a = a;
		ParentClass.b = b; 
		System.out.println(pc.a+ParentClass.b);
	}
	
	public void addition2(int a, int b) {
		this.a = a;
		ParentClass.b = b;
		System.out.println(this.a+ParentClass.b);
	}

	public static void main(String[] args) {
//		childClassMethod(); // parent can't access child property
		
		// Polymorphism
		ParentClass pc = new ParentClass(); // #1 creating instance of this class
		GrandParent gp = new ParentClass(); // #2 creating instance of this class
		pc.multiplication(5, 9);
		pc.addition2(10, 20);

		// method overriding
		pc.childClassMethod(); 
		gp.childClassMethod(); // method though called from super class, sub-class method will execute
		
//		gp.addition1(10,20); // can't access method from this class as object is pointing towards superClass
		gp.multiplication(4, 3);
	}

}
