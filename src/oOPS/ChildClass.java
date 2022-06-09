package oOPS;

public class ChildClass extends ParentClass{
	
	public void childClassMethod() {
		super.childClassMethod();
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		addition1(10,20);
		b = 100;
		System.out.println(b);
		
		ChildClass cc = new ChildClass(); // #1 instance
		ParentClass pc = new ChildClass();
		GrandParent gp = new ChildClass();
		cc.addition2(100, 200);
		cc.a = 500;
		System.out.println(cc.a);
		
		// GrandParent property
		cc.multiplication(10, 9);
		
		// method overriding
		cc.childClassMethod();
		pc.childClassMethod();
		gp.childClassMethod();
	}

}
