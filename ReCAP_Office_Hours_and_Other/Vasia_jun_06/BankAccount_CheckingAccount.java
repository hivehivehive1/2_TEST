package Vasia_jun_06;
public class BankAccount_CheckingAccount extends BankAccount {
	private boolean overdraft;
	// a constructor that accepts a String and a boolean.
	public BankAccount_CheckingAccount(String name, boolean overdraft) {
		// The String parameter is used in the invocation of the superclass
		// (BankAccount) constructor,
		super(name);
		// while the boolean is used to initialize the overdraft instance variable.
		this.overdraft = overdraft;
	}
	// a method, hasOverdraft, that returns a boolean. hasOverdraft returns true if
	// the account supports overdraft.
	public boolean hasOverdraft() {
		return overdraft;
	}
	// this will be the case if the amount is less than the balance in the account,
	// or if the account allows overdraft.
	// If the check can be cashed, clearCheck returns true, and also calls the
	// withdraw method to update the account balance;
	// otherwise, clearCheck returns false.
	public boolean clearCheck(double amount) {
		if (amount < getBalance() || overdraft) {
			super.withdraw(amount);
			return true;
		}
		System.out.println("Not ehough credit!");
		return false;
	}
}