package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a new bank account >> think instantiate an object

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Checking Account");
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		
		System.out.println(acc1.sortCode);
		System.out.println(acc2.sortCode);
		System.out.println(acc3.sortCode);
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		
	}

}
