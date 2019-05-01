package day18_while_down_hill_loops;
import java.util.Scanner;
public class GiveMe5Dollars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int dollars = 0;
		
		while(dollars != 5) {
			System.out.println("Give me 5 Dollars.");
			dollars = s.nextInt(); //until 5
		}
		System.out.println("Thank you for 5$");

}}
