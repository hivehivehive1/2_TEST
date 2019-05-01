package day21_LOOPS_practice1;
import java.util.Scanner;
public class NumberMoreThan100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
//		int sumOfsums = 0;
		do {
			System.out.println("Enter 2 numbers");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			sum = n1 + n2;
//			sumOfsums += sum;
//			System.out.println(sumOfsums);
		}while(sum <= 100);
		System.out.println("Good Number");
	}

}
