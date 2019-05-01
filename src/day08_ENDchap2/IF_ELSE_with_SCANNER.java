package day08_ENDchap2;

import java.util.Scanner;

public class IF_ELSE_with_SCANNER {

	public static void main(String[] args) {
		//passingPrecentage = 65;
		//yourScorePrecentage = take from scanner
		//check if you passed or failed
		Scanner scan = new Scanner(System.in);
		
		int passingPrecentage = 65;
				System.out.println("Whats your score?");
		passingPrecentage = scan.nextInt();
		int yourScorePrecentage = scan.nextInt();
		
		if(yourScorePrecentage >= passingPrecentage) {
			System.out.println("You PASSED! CONGRETS");
		}else {
			System.out.println("YOU FAILED");
		}
		
		
			}

}
