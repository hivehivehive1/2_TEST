package day07_Scanner;
import java.util.Scanner;
public class Second_Minutes_Hours_ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inputSeconds, hours, minutes, seconds;

		System.out.println("Enter seconds:");

		inputSeconds = scan.nextInt();

		seconds = inputSeconds % 60;
		minutes = (inputSeconds / 60) % 60;
		hours = (inputSeconds / 60) / 60;

		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
}}