package oop;

public class BankAccount {
	//Define variables
	String accountNumber;
	
	//static >> belongs to the CLASS and not the object instance
	//final >> constant (often static final)
	static final String sortCode = "601711";
	String name;
	String ssn; // social security number
	String accontType;
	int balance;
	//Constructor Definitions (i.e.e unique methods
	  //1. used to define / setup / initialise properties of an object
	  //2. Constructors are IMPLICITLY called upon instantiation (.i.e during creation of a new object. 
	  //  when not there, java gives us an empty one by default
	  //3. Has the same name as the class itself
	  //3. Have no return type, i.e. no void, not string,no double etc
	  
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	 //Overloading: call same method name with different arguments
	
	BankAccount(String accontType){
		System.out.println("NEW ACCOUNT: " + accontType);
	}
	
	BankAccount(String accontType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accontType);
		System.out.println("INITIAL DEPOSIT OF: £ " + accontType);
	}
	
	//Define Methods
	void deposit() {
		
	}
	 void withdraw() {
		 
	 }
	 
	 void checkBalance() {
		 
	 }
	 
	 void getStatus() {
		 
	 }
	
		
}
