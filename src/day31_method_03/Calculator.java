package day31_method_03;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Select operator: '+', '-', '*', '/', '%'");
		String operator = scan.next();
		//using switch statement, call the matching method to perform calculator
		switch (operator) {
		case "+":
			add(num1, num2);
		break;
		case "-":
			subtract(num1, num2);
		break;
		case "*":
			multiply(num1, num2);
		break;
		case "/":
			divide(num1, num2);
		break;
		case "%":
			remainder(num1, num2);
		break;
		default:
			System.out.println("Invalid operator");
		}
System.out.println("******************************");
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		remainder(num1, num2);
		}
//add, subtract, multiply, divide, remainder
		
		public static void add(double num1 , double num2) {
			double result = num1 + num2;
			System.out.println("Result of add       (+) : " + result);
		}
		public static void subtract(double num1 , double num2) {
			double result = num1 - num2;
			System.out.println("Result of subtract  (-) : " + result);	
		}
		public static void multiply(double num1 , double num2) {
			double result = num1 * num2;
			System.out.println("Result of multiply  (*) : " + result);
		}
		public static void divide(double num1 , double num2) {
			if(num2 == 0) {
				System.out.println("cannot / by zero");
				return; //EXIT the method here. Don't run the rest
			}
			double result = num1 / num2;
			System.out.println("Result of divide    (/) : " + result);
		}
		public static void remainder(double num1 , double num2) {
			double result = num1 % num2;
			System.out.println("Result of remainder (%) : " + result);	
		}
}