package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import tools.Record;

public class BankAccountTest {
	BankAccount bankAccount;

	@Before
	public void init() {
		bankAccount = new BankAccount(0);
	}
	
	@Test
	public void when_deposit_of_500_account_is_increased_by_500()  {
		int oldAmount = bankAccount.getAmount();
		bankAccount.deposit(500);
	
		assertEquals(bankAccount.getAmount() - oldAmount, 500);
	}
	
	@Test
	public void when_withdraw_of_500_account_is_decreased_by_500()  {
		int oldAmount = bankAccount.getAmount();
		bankAccount.withdraw(500);
	
		assertEquals(oldAmount - bankAccount.getAmount(), 500);
	}
	
	@Test
	public void when_deposit_record_is_made_with_informations()  {
		bankAccount.deposit(500);
		Record record = new Record(bankAccount, 500, "Deposit");
		
		assertTrue(bankAccount.getRecords().contains(record));
	}
	
	@Test
	public void when_withdraw_record_is_made_with_informations()  {
		bankAccount.withdraw(500);
		Record record = new Record(bankAccount, 500, "Withdraw");
		
		assertTrue(bankAccount.getRecords().contains(record));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_creation() {
		@SuppressWarnings("unused")
		BankAccount bankAccountNegative = new BankAccount(-600);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_deposit() {
		bankAccount.deposit(-800);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_withdraw() {
		bankAccount.withdraw(-800);
	}
	
	

}
