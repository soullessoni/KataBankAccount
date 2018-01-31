package bank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Exceptions.DepositException;
import Exceptions.NegativeCreationException;
import Exceptions.NegativeDepositException;
import Exceptions.NegativeWithdrawException;
import Exceptions.NoDepositRecordException;
import Exceptions.NoWithdrawRecordException;
import Exceptions.WithdrawException;
import tools.Record;

public class BankAccountTest {
	BankAccount bankAccount;

	@Before
	public void init() {
		bankAccount = new BankAccount(0);
	}
	
	@Test
	public void when_deposit_of_500_account_is_increased_by_500() throws DepositException {
		int oldAmount = bankAccount.getAmount();
		bankAccount.deposit(500);
	
		assertEquals(bankAccount.getAmount() - oldAmount, 500);
	}
	
	@Test
	public void when_withdraw_of_500_account_is_decreased_by_500() throws WithdrawException {
		int oldAmount = bankAccount.getAmount();
		bankAccount.withdraw(500);
	
		assertEquals(oldAmount - bankAccount.getAmount(), 500);
	}
	
	@Test
	public void when_deposit_record_is_made_with_informations() throws NoDepositRecordException {
		bankAccount.deposit(500);
		Record record = new Record(bankAccount, 500, "Deposit");
		
		assertTrue(bankAccount.getRecords().contains(record));
	}
	
	@Test
	public void when_withdraw_record_is_made_with_informations() throws NoWithdrawRecordException {
		bankAccount.withdraw(500);
		Record record = new Record(bankAccount, 500, "Withdraw");
		
		assertTrue(bankAccount.getRecords().contains(record));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_creation() throws NegativeCreationException{
		@SuppressWarnings("unused")
		BankAccount bankAccountNegative = new BankAccount(-600);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_deposit() throws NegativeDepositException{
		bankAccount.deposit(-800);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void when_negative_withdraw() throws NegativeWithdrawException{
		bankAccount.withdraw(-800);
	}
	
	

}
