package day12_SWITCH_ternary;
import java.util.Scanner;
public class OR_LogicWithSwitch_Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter grade: ");
		char grade = scan.next().toUpperCase().charAt(0);
		
		//A, B, C -> PASS (D,F FAIL invalid grade)
		switch(grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':	
			System.out.println("Fail");
		default:
			System.out.println("Invalid grade!");
}}}
