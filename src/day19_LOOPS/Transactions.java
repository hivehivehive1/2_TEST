package day19_LOOPS;
import java.util.Scanner;
public class Transactions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		
		while(balance > 0) {
			System.out.println("What is transaction amount?");
			double trans = scan.nextDouble();
			//balance = balance - transaction;
			balance -= trans;
		}
		System.out.println("You have insufficient funds for any more, your balance is: " + balance);
		
}}
