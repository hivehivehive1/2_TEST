package day19_LOOPS;
import java.util.Scanner;
public class EnterPassword {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pas = "asd123";
		String input;
		
		do {
			System.out.println("Enter password");
			input = scan.next();
			
		}while(!input.equals(pas)); //if input is not same as password, keep asking to enter
			System.out.println("password correct");
}}
