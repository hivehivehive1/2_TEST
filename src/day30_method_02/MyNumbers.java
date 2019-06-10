package day30_method_02;
import java.util.Random;
import java.util.Scanner;
public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
//		while(true) {
//			showMe5Numbers(); //NEVER END
//		}
		doPush10Ups();
		rangePrint();
	}
// 1)method name: showMe5Numbers
//   return type: void
//   params: no
//   prints 3 random numbers 0, 1000
//   in same line separated by comma
//   Ex:
//   showMe5Numbers(); 345, 234, 566, 2, 23
	public static void showMe5Numbers() {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001) + " ");
		}System.out.println();
System.out.println("=============================================================");
	}
	public static void doPush10Ups() {
		for (int i = 0; i < 3; i++) {
			System.out.println("PushUp - " + i);
		}
		System.out.println("Time to rest");

System.out.println("=============================================================");}
//2) method name: rangePrint 
//	 return type: void 
//	 params/args: no 
//	 Using a scanner ask for 2 num. you need to print all numbers between those 2 numbers.  
//ex:rangePrint(); 5 8 5 6 7 8
//   rangePrint(); 10 7 10 9 8 7
//   rangePrint(); 40 40 40

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int n1 = num1; n1 <= num2; n1++)
				System.out.print(n1 + " "); 		// 1 2 3 4 5
		}else if (num1 > num2) {
			for (int n2 = num1; n2 >= num2; n2--) {
				System.out.print(n2 + " ");			// 5 4 3 2 1
			}
		}else {
			System.out.print(num1); // 40
		}
		System.out.println();
}}