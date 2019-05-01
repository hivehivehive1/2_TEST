package day10_logical_Operators_conditioals;
import java.util.Scanner;
public class CreditScoreRaiting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score: ");
		int cs = scan.nextInt();
												//Excellent > 750 - 850 range
			  if(cs >= 750 && cs <= 850) {
			System.out.println("Excelent!");
		}else if(cs >= 700 && cs <= 749) {
			System.out.println("Good!");
		}else if(cs >= 650 && cs <= 699) {
			System.out.println("Fair!");
		}else if(cs >= 550 && cs <= 649) {
			System.out.println("Poor!");
		}else if(cs >= 0 &&   cs <= 549) {
			System.out.println("Bad!");
		}else {
			System.out.println("Invalid score!");
}}}