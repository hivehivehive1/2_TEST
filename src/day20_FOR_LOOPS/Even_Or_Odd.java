package day20_FOR_LOOPS;
public class Even_Or_Odd {
	public static void main(String[] args) {
		//using for loop: 1-100
//1.print all even numbers in same line
		for(int a = 1; a <= 100; a++) {
			if(a % 2 == 0) { //check if it is even
				System.out.print(a + ", ");
		}}
		System.out.println();
//2.print all odd numbers in same line
		for(int b = 1; b <= 100; b++) {
			if(b % 2 != 0) {
				System.out.print(b + ", ");
		}}
		//3.sumOfOdds, sumOfEvens -  calculate them
		//and print out after the loop
		//sum of 1 - 10
		//1+2+3+4+5+6+7+8+9+10
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		for(int num = 1; num <= 100; num++) {
			if(num % 2 == 0) {
				sumOfEvens += num;	//sumOfEvens = sumOfEvens + num;
			}else {
				sumOfOdds += num;
			}}
		System.out.println();
		System.out.println();
		System.out.println("Sum of Odds: " + sumOfOdds);
		System.out.println("Sum of Evens: " + sumOfEvens);
}}