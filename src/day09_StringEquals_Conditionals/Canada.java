package day09_StringEquals_Conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the capital of Canada?");
		String capital = s.nextLine();
		//Check if the answer is correct.
		if(capital.equalsIgnoreCase("Ottawa")) {		 //IgnoreCase! Ottawa > ottawa. Upper and Lower CASE
			System.out.println("Your aswer is correct!");
		}else {
			System.out.println("Your answer is incorect! "+capital+" is not capital of Canada");

	}}}
