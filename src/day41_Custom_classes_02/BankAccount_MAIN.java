package day41_Custom_classes_02;
public class BankAccount_MAIN {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
			acc1.accountHolder = "Chuck Noris";
			acc1.accountNumber = 111111111;
			acc1.deposit(250);
			acc1.withdraw(100);
			acc1.showBalance();
			
			acc1.charge(160000, "RR");
			acc1.showBalance();
}}