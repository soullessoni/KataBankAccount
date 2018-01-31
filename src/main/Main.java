package main;

import bank.BankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount(30);
		
		bankAccount.deposit(1);
		
		bankAccount.withdraw(300);
		
		System.out.println(bankAccount);
	
	}

}
