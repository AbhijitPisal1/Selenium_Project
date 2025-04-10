package com.bankingsystem;

// Runner class that demonstrates all the OOP concepts by creating objects and invoking methods.
public class BankingSystemRunner {

	public static void main(String[] args) {

		// Creating checking and savings account objects
		CheckingAccount checkingAccount = new CheckingAccount("CHK001", 1000, "Alice", 500);
		SavingsAccount savingsAccount = new SavingsAccount("SAV001", 5000, "Bob", 2.5);

		// Creating ATM objects
		ATM atm1 = new ATM(checkingAccount);
		ATM atm2 = new ATM(savingsAccount);

		// Performing transactions
		atm1.deposit(200);
		atm1.withdraw(100);
		atm2.deposit(300);
		atm2.withdraw(500);

		// Calculating interest for savings account
		savingsAccount.calculateInterest();

		// Displaying account details
		checkingAccount.displayAccountDetails();
		savingsAccount.displayAccountDetails();
	}
}

/**
 * Explanation: This Runner class demonstrates the use of all the OOP concepts.
 * It creates instances of CheckingAccount and SavingsAccount, uses the ATM
 * class to perform transactions, and calculates interest for the SavingsAccount
 */

/**
 * Expected Output
 * Deposit of $200.0 successful. New balance: $1200.0
 * Withdrawal of $100.0 successful. New balance: $1100.0
 * Deposit of $300.0 successful. New balance: $5300.0
 * Withdrawal of $500.0 successful. New balance: $4800.0
 * Interest of $120.0 added to the account. New balance: $4920.0
 * Account Holder: Alice
 * Account Number: CHK001
 * Balance: $1100.0
 * Account Holder: Bob
 * Account Number: SAV001
 * Balance: $4920.0
*/
