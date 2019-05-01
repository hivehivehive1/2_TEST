package day18_while_down_hill_loops;
import java.util.Scanner;
public class PinCodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1111;
		//give only 3 attempts //if attempts more than 3 card KOTOK
		int pincode = 0;
		int attempts = 0;
		
		while(pincode != secretPincode) {
			System.out.println("Enter pincode: ");
			pincode = scan.nextInt();
			attempts++;
			
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked!");
				return; //STOP
			}
		}
		System.out.println("Access granted!");
}}