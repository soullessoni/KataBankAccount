package main;

import bank.BankAccount;

public class Main {

	public static void main(String[] args) {
		try {
			BankAccount bankAccount = new BankAccount(300);
			
			bankAccount.deposit(1);
			
			bankAccount.withdraw(300);
			
			System.out.println(bankAccount);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
