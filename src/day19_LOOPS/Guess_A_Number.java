package day19_LOOPS;
import java.util.Random;
import java.util.Scanner;
public class Guess_A_Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random(); //is used to generate random numbers
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		//this will give us a number between 0 -100
		int secNum = random.nextInt(101);
		int guesNum;
		int count=0;
		do {
			count++;
			if(count>5) {
			System.out.println("no more chance");
			System.exit(0);
			}
			System.out.println("Guess a number: ");
			guesNum = scan.nextInt();
			if(guesNum < secNum) {
				System.out.println("Your number is too small");
			}else if(guesNum > secNum) {
				System.out.println("Your number is too large");
			}
		}while(guesNum != secNum);
		System.out.println("Congrets, you won!");
}}