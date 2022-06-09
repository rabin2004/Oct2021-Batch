package oOPsPractice;

import oOPS.ParentClass;

public class ChildClass2 extends ParentClass{

	public static void main(String[] args) {
		addition1(10,20);
		
		// protected VS default access modifier
//		b = 100; // default access modifier can't be accessed from different package
//		System.out.println(b);
		
		ChildClass2 cc = new ChildClass2();
		cc.addition2(100, 200);
		cc.a = 500; // protected access modifier can be accessed from different package
		System.out.println(cc.a);
		
		// grand parent class
		cc.multiplication(7, 7);

	}

}
