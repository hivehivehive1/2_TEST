package day31_method_03;
import java.util.Scanner;
public class TASK_Counter {
	public static void main(String[] args) {
		/*	name: countUp
		 * 	return type: void
		 *  parm: int
		 *  its print from1 to the value of the parm
		 *  countUp(5);
		 *  1 2 3 4 5
		 *  int j;
		 *  String str; */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp");
		int inputNum1 = scan.nextInt();
		//call countUp method and set it as input
		countUp(inputNum1);
		
		System.out.println("Enter num to countDown");
		int inputNum2 = scan.nextInt();
		//call countUp method and set it as input
		countDown(inputNum2);
		
	}
		public static void countUp(int num1) {
			if(num1 < 1) {
				System.out.println("Invalid input");
		}else {
			for(int i = 1; i <= num1; i++) {
				System.out.print(i + " ");
			}
System.out.println();
			}
			}
		public static void countDown(int num2) {
			if(num2 < 1) {
				System.out.print("Invalid input");
		}else {
			for(int i = num2; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			}
}}