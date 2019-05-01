package day19_LOOPS;
import java.util.Scanner;
public class Transactions_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;
		
		while(balance > 0) {
			count++; //increase trans by 1
			System.out.println("What is transaction # " +count+ " amount?");
			double trans = scan.nextDouble();	
			//balance = balance - transaction;
			if(trans > balance) {
				System.out.println("Your balance is NEGATIV!");
				//continue; INFINITY!
			}
			balance -= trans;
			System.out.println("Current balance: " + balance);
			
		}
		System.out.println("You have insufficient funds for any more, your balance is: " + balance);
		System.out.println("Tranactions total count: " + count);

	}

}
