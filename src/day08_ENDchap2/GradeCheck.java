package day08_ENDchap2;
import java.util.Scanner;
public class GradeCheck {
	public static void main(String[] args) {
		//A, B, C, D
		//char grade = scan.next().charAt();
		//if 'A' => 
		//		Excellent Job! Keep it up!
		//else
		//		how many points did you miss for 'A'?
		//		int points = scanner
		//		print "your grade B is not good enough."
		//			  "you could earn 10 more points if you studied harder."
		int a = 100;
		int b = 75;
		int c = 50;
		int d = 25;
		System.out.println("#############START PROGGRAM#############");
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your grade?" );
		char grade = scan.next().toUpperCase().charAt(0);
		if(grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
		}else {
			System.out.println("your grade "+grade+" is not good enough.");
			System.out.println("how many points did you miss for 'A'?");
			int points = scan.nextInt();
			System.out.println("you could earn "+points+" more points if you studied harder.");
}}}