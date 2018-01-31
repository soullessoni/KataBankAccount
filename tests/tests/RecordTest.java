package tests;

import org.junit.Test;

import bank.BankAccount;
import tools.Record;

public class RecordTest {

	@Test(expected=IllegalArgumentException.class)
	public void when_account_unknown_throw_exception() {
		new Record(null, 100, "Deposit");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_amount_negative_throw_exception() {
		new Record(new BankAccount(0), -3, "Deposit");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_type_unknown_throw_exception() {
		new Record(new BankAccount(0), 100, "");
	}
	
	

}
