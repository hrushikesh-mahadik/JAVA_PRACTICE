package com.oops.Interfaces;

public abstract class BankAccount {

	protected double balance;
	
	public BankAccount(double intialbalance) {
		this.balance=intialbalance;
	}
	
	abstract void deposit(double amount);
	abstract void Withdraw(double amount);
	
}
