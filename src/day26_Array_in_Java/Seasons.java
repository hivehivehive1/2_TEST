package day26_Array_in_Java;
import java.util.Scanner;
public class Seasons {
	public static void main(String[] args) {
//print season name
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter month number: ");
		int month = scan.nextInt();
		if(month == 1 && month <= 2 || month == 12) {
			System.out.println("Winter");
		}else if(month >= 3 && month <= 5) {
			System.out.println("Spring");
		}

}}
