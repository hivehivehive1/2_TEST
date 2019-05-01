package day20_FOR_LOOPS;
import java.util.Scanner;
public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		//check if it is valid, if it not valid return
		if(num < 1 || num > 10) {
			System.out.println("ERROR: Invalid input");
			//return;
			System.exit(0);
		}
		//for loop to print multiplication table
		for(int i = 1; i <= 10 ; ++i) {
			System.out.println(num + " x " + i + " = " + (num * i));
}}}
