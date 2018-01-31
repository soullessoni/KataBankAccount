package bank;

import java.util.Iterator;
import java.util.LinkedList;

import tools.Record;

public class BankAccount {

	private int amount;
	private LinkedList<Record> records;
	
	public BankAccount(int amount) {
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
		this.amount += depositAmount;
		this.records.add(new Record(this, depositAmount, "Deposit"));
	}

	public void withdraw(int withdrawAmount) {
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