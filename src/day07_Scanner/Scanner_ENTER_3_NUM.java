package day07_Scanner;

import java.util.Scanner;

public class Scanner_ENTER_3_NUM {

	public static void main(String[] args) {
		int num1, num2, num3, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		sum = num1 + num2 + num3;
		
		System.out.println("Sum of numbers: "+sum);
		

	}

}
