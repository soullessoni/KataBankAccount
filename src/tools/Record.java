package tools;

import java.util.Date;

import bank.BankAccount;

public class Record {
	private Date dateRecord;
	private BankAccount target;
	private int amount;
	private String type;
	
	public Record(BankAccount target, int amount, String type) {
		if (target == null)
			throw new IllegalArgumentException("Bank Account can't be null");
		if (amount < 0)
			throw new IllegalArgumentException("Amount can't be negative");
		if (!(type.equals("Deposit")) && !(type.equals("Withdraw")) && !(type.equals("Creation")))
			throw new IllegalArgumentException("Type can't be different from List: Deposit, Withdraw, Creation");
		this.dateRecord = new Date();
		this.target = target;
		this.amount = amount;
		this.type = type;
	}
	
	public String toString() {		
		String str = "";
		str += "------------------------------------------ \n";
		str += "--   " + this.dateRecord + "\t-- \n";
		str += "--   " + this.type + "\t : \t" + this.amount + "\t\t--\n";
		str += "------------------------------------------ \n";
		return str;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public BankAccount getTarget() {
		return target;
	}

	public void setTarget(BankAccount target) {
		this.target = target;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj.getClass() != this.getClass())
			return false;
		
		Record objRecord = (Record) obj;
		if(this.amount != objRecord.amount)
			return false;
		if(this.target != objRecord.target)
			return false;
		if(this.type != objRecord.type)
			return false;		
		if(this.dateRecord.getTime() != objRecord.dateRecord.getTime())
			return false;
		
		return true;
	}
}
