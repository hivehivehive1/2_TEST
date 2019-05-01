package day30_method_02;
import java.util.Scanner;
public class TASK_print_55_STARS {
	public static void main(String[] args) {
		print5Stars(); //call the method //1 time
//call print5Stars 100 times
		for(int i = 0; i < 3; i++) {
		print5Stars(); //3 times
		}
		introduce();
	}
	public static void print5Stars() {
		System.out.println("* * * * *");
	}
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
}}