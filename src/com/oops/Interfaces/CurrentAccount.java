package com.oops.Interfaces;



public class CurrentAccount extends BankAccount{
		public CurrentAccount(double intialbalance) {
		super(intialbalance);
		System.out.println("balane is "+intialbalance);
	}

		void deposit(double amount ) {
			balance += amount;
			System.out.println("Deposit in Saving " + amount);
			System.out.println("total balance is " +balance);
		}

		@Override
		void Withdraw(double amount) {
			if(balance - amount >=100) {
				balance -= amount;
				System.out.println("Withdra in saving "+amount);
			}else{
				System.out.println("saving denied min balance");
			}
			}
}
