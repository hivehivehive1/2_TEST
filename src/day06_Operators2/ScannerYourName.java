package day06_Operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hi, What is your name? ");
				
		String name = scan.nextLine(); //accept String input
		// .next .nextLine = 1 or full line
		System.out.print("Nice to meet you, " + name);

	}

}
