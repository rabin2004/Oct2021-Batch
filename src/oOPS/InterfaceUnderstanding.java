package oOPS;

	// Class Vs Interface ??
	// Abstract Class Vs Interface also similarity??

public interface InterfaceUnderstanding {
	// Interface -> for high level rules
		// 1. all methods will be default abstract
		// 2. abstract keyword is not required from methods (no difference if mentioned)
		// 3. no need to provide abstract keyword for the interface
		// 4. implementation of interface methods can only happen in class
		// 5. to implement method from interface -> create inheritance between interface(parent) and class(child) -> keywords "implements"
		// 6. can't create instance/object of interface
	
	
	// E.g BOA Global Head Office: Banking application -> login/Register/Deposit checks/Transfer money/Apply Credit cards/Open Online account/Apply mortgage
	void login(); // default abstract
	abstract void register(); // abstract keyword is optional
	void depositCheck();
	void TransferMoney();
	void applyCreditCards();
	void openOnlineAccount();
	void applyMortgage();
}
