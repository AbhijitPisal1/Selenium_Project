package project.bankingsystem;

// This class simulates an ATM system where customers can withdraw and deposit money.
public class ATM {
	private Account account;

	// Constructor to initialize the ATM with an account
	public ATM(Account account) {
		this.account = account;
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		account.withdraw(amount);
	}

	// Method to deposit money into the account
	public void deposit(double amount) {
		account.deposit(amount);
	}
}
/**
 * Explanation: The ATM class simulates ATM functionality where users can
 * withdraw or deposit money into their accounts. It uses Encapsulation to store
 * the Account object and provide methods to interact with it.
 */
