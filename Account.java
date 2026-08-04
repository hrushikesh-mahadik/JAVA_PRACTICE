package com.oops.polymorphism;

public class Account {

	public void interest() {
		System.out.println("Your Interest");
	}
	
	
	public static void main(String[] args) {
		Account a = new SavingAccount();
		Account c = new CurrentAccount();
		a.interest();
		SavingAccount b = new SavingAccount();
		b.interest();
		
	}
}


