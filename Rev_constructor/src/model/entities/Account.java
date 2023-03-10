package model.entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		deposit(balance);;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void whitdraw(double amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Account " + number + ", holder: " + holder + ", balance= $ " + balance;
	}
	
	

}
