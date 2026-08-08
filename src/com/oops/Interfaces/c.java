package com.oops.Interfaces;

public class c {
	public static void main(String[] args) {
		BankAccount b = new SavingAccount(100);
		b.deposit(300);
		b.Withdraw(100);
		
		BankAccount b1 = new CurrentAccount(200);
		b1.deposit(400);
		b1.Withdraw(100);
		
	}

}
