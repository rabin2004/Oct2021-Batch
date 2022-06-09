package oOPS;

public class GrandParent {
	
	int x;
	static int y;
	
	public void multiplication(int a, int b) {
		x = a;
		y = b;
		System.out.println(x*y);
	}
	
	public void childClassMethod() {
		System.out.println("Grand Parent class");
	}

	public static void main(String[] args) {

	}

}
