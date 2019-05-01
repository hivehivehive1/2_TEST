package day23_AGENDA;
import java.util.Scanner;
public class CalculateSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//calculate a sum of 6 numbers
		//if number is less or equals to 0, ignore this number
		int sum = 0;
		int num = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter a number: ");
			num = scan.nextInt();
			if(num <= 0) {
				continue;
			}
			sum += num;
		}
		System.out.println("Total sum: " + sum); //SKIPPING - minus 
}}
