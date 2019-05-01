package day08_ENDchap2;
import java.util.*;
public class PhoneNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter your area code:");
			int areaCode = scan.nextInt();
			
			System.out.print("Enter local number:");
			int localNumber = scan.nextInt();
			//(555)555-5555
			String phoneNumber = "("+ areaCode + ") - " + localNumber;
			
			System.out.print("Calling number " + phoneNumber);		
}}