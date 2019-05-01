package day33_method_05_with_ReTurn_value;
import java.util.Scanner;
public class AgeCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year birth year");
		int year = calculatorAge(scan.nextInt());
	}
		public static int calculatorAge(int year) {
			int yearNow = 2019;
			int age = yearNow - year;
				  if(age >=  0 && age <= 15) {
				System.out.println("Child: " + age);
			}else if(age >= 16 && age <= 24) {
				System.out.println("Young: " + age);
			}else if(age >= 25 && age <= 64) {
				System.out.println("Adult: " + age);
			}else{
				System.out.println("OLD SHIT! " + age);
				
		}
			return age;
}}