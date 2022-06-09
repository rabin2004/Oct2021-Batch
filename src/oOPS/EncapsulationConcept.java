package oOPS;

public class EncapsulationConcept {
	// Encapsulation -> data hiding
		// 1. variables should private
		// 2. public methods using the variable 	-> setMethod()-to assign value
											//		-> getMethod()-display/expose value

	private String DOB;
	private String SSN;
	
	public void setDOB(String DOB) {
		this.DOB=DOB;
	}
	public String getDOB() { // MM/DD/YYYY
		String year = DOB.substring(6);
		String maskedDOB = "******".concat(year);
		return maskedDOB;
	}
	
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public String getSSN() { // 123456789
		String lastFour = SSN.substring(5);
		String maskedSSN = "*****".concat(lastFour);
		return maskedSSN;
	}
	
	public static void main(String[] args) {
		

	}

}
