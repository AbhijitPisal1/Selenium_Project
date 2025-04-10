package com.bankingsystem;

// This class represents a Checking Account. It inherits from the Account class.
public class CheckingAccount extends Account {
	private double overdraftLimit;

	// Constructor to initialize checking account details
	public CheckingAccount(String accountNumber, double balance, String accountHolderName, double overdraftLimit) {
		super(accountNumber, balance, accountHolderName); // Using the super() to call the parent class constructor
		this.overdraftLimit = overdraftLimit;
	}

	// Getter and Setter (Encapsulation)
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	// Implementing abstract withdraw method (polymorphism)
	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance() + overdraftLimit) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + getBalance());
		} else {
			System.out.println("Withdrawal failed. Insufficient funds.");
		}
	}

	// Implementing abstract deposit method
	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposit of $" + amount + " successful. New balance: $" + getBalance());
	}
}

/**
 * Explanation: The CheckingAccount class extends the Account class, meaning it
 * inherits the properties and methods of Account (like balance and account
 * holder). It implements the abstract methods (withdraw and deposit) and adds
 * specific functionality for overdraft limits. This demonstrates Inheritance
 * and Encapsulation.
 */
