package Vasia_jun_06;
public class BankAccount_CapitalOne {
	public static void main(String[] args) {
	BankAccount_CheckingAccount acc1 = new BankAccount_CheckingAccount("James Bond", false);
		System.out.println(acc1);
		acc1.deposit(100000);
		acc1.clearCheck(5000);
		System.out.println(acc1.getBalance());
	}
} 