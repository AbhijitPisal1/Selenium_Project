package project.bankingsystem;

// This class represents a Savings Account. It inherits from the Account class and includes interest calculation functionality.
public class SavingsAccount extends Account {
	private double interestRate;

	// Constructor to initialize savings account details
	public SavingsAccount(String accountNumber, double balance, String accountHolderName, double interestRate) {
		super(accountNumber, balance, accountHolderName); // Using the super() to call the parent class constructor
		this.interestRate = interestRate;
	}

	// Getter and Setter (Encapsulation)
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Implementing abstract withdraw method
	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
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

	// Method to calculate interest (Advanced feature)
	public void calculateInterest() {
		double interest = getBalance() * interestRate / 100;
		setBalance(getBalance() + interest);
		System.out.println("Interest of $" + interest + " added to the account. New balance: $" + getBalance());
	}
}

/**
 * Explanation: The SavingsAccount class extends the Account class and
 * implements the withdraw and deposit methods. It also introduces an interest
 * calculation feature, demonstrating Abstraction and Encapsulation.
 */