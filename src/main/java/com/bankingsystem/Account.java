package com.bankingsystem;

// Abstract class representing a bank account. This class uses abstraction to define common methods for all account types.
public abstract class Account {
	private String accountNumber;
	private double balance;
	private String accountHolderName;

	// Constructor to initialize account details
	public Account(String accountNumber, double balance, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	// Getters and Setters (Encapsulation)
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	// Abstract methods that must be implemented by subclasses
	public abstract void withdraw(double amount);

	public abstract void deposit(double amount);

	// Common method to display account details
	public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

/**
 * Explanation: The Account class is abstract, meaning it cannot be instantiated
 * directly. It provides common functionality (like displaying account details)
 * and abstract methods (withdraw, deposit) that must be implemented by its
 * subclasses (Checking and Savings accounts). It uses Encapsulation to protect
 * account details
 */