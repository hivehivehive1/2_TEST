package day26_Array_in_Java;
import java.util.Scanner;
public class Time {
	public static void main(String[] args) {
		int time = 20;
		//condition ? if true: if false
		System.out.println(time < 18 && time > 0 ? "Good afternoon" : "Good");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter score: ");
		
		int score = scan.nextInt();
		System.out.println(score >= 64 ? "Passed" : score < 0 ? "Failed" : "KOTOK" );
		
		
		
}}
