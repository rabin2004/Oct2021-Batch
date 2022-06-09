package oOPS;

public abstract class ImplementingInterface1 implements InterfaceUnderstanding,ChinaBankingRule{
	// if class implements all the methods from interface -> class can be regular class
	// if class is not implementing all the methods from interface -> class should be abstract
	
	// Multiple inheritance -> between class and interfaces -> class can inherit multiple interfaces
	
	// BOA Community branch in HongKong
	
	public void login() {
		System.out.println("Login");
	}
	
	public  void register() {
		System.out.println("Register");
	}
	

	public static void main(String[] args) {

	}

	@Override
	public void cryptoCoinTransfer() {
		System.out.println("Cryptocoin transfer");
		
	}

	@Override
	public void applyForDebitCard() {
		System.out.println("Apply for debit card");
		
	}

//	@Override
//	public void depositCheck() {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void TransferMoney() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void applyCreditCards() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void openOnlineAccount() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void applyMortgage() {
//		// TODO Auto-generated method stub
//		
//	}

}
