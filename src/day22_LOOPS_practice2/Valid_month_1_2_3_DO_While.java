package day22_LOOPS_practice2;
import java.util.Scanner;
public class Valid_month_1_2_3_DO_While {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month;
		do {
			System.out.println("Enter month");
			month = scan.nextInt();
		}while(month >= 1 && month <= 12);
//OR	}while(month > 0 && month < 13);
		System.out.println("Invalid month! " + month);
}}
