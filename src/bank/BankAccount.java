package bank;

import java.util.LinkedList;

import tools.Record;

public class BankAccount {

	private int amount;
	private LinkedList<Record> records;
	
	public BankAccount(int amount) {
		if (amount < 0)
			throw new IllegalArgumentException("Creation amount can't be negative");

		this.amount = amount;
		this.records = new LinkedList<Record>();
		this.records.add(new Record(this, amount, "Creation"));
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public LinkedList<Record> getRecords() {
		return records;
	}

	public void setRecords(LinkedList<Record> records) {
		this.records = records;
	}

	public void deposit(int depositAmount) {
		if (depositAmount < 0)
			throw new IllegalArgumentException("Deposit amount can't be negative");
		this.amount += depositAmount;
		this.records.add(new Record(this, depositAmount, "Deposit"));
	}

	public void withdraw(int withdrawAmount)  {
		if (withdrawAmount < 0)
			throw new IllegalArgumentException("Withdraw amount can't be negative");
		this.amount -= withdrawAmount;
		this.records.add(new Record(this, withdrawAmount, "Withdraw"));
	}

	@Override
	public String toString() {
		String str = "";
		str += "------------------------------------------ \n";
		str += "--         Current Balance :\t" + this.amount + "\t--\n";
		str += "------------------------------------------ \n";
		for (Record record : records) {
			str += record.toString() ;
		}
		return str;
	}

}
