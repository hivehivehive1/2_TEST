package day23_AGENDA;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		//verify if number is prime
		//Prime number is a whole number grater then 1 and cannot be made by 
		//multiplying other whole numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int prime = scan.nextInt();
		
		for(int p = 2; p < prime; p++) {
			if(prime % p == 0) {
				System.out.println(prime + " It's a NOT prime number");
				return;
			}
			}
			System.out.println(prime + " It's a prime number");
}}