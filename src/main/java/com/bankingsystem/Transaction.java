package com.bankingsystem;

// This class represents a transaction in the banking system, like deposit, withdrawal, or transfer.
public class Transaction {
	private String transactionType;
	private double amount;
	private String date;

	// Constructor to initialize transaction details
	public Transaction(String transactionType, double amount, String date) {
		this.transactionType = transactionType;
		this.amount = amount;
		this.date = date;
	}

	// Getters and Setters (Encapsulation)
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	// Method to display transaction details
	public void displayTransactionDetails() {
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + date);
    }
}

/**
 * Explanation: The Transaction class stores details of individual transactions
 * (like type, amount, and date). It uses Encapsulation to protect transaction
 * information and provides methods to access and display it.
 */