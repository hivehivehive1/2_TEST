package day12_SWITCH_ternary;
import java.util.Scanner;
public class Calculator_V02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = scan.next();
		double result = 0.0;
		switch(operator) {
		
		case "+":
		result = num1 + num2;
		System.out.println(result);
		break;
		case "-":
		result = num1 - num2;
		System.out.println(result);
		break;
		case "*":
		result = num1 + num2;
		System.out.println(result);
		break;
		case "/":
		result = num1 - num2;
		System.out.println(result);
		break;
		case "%":
		result = num1 - num2;
		System.out.println(result);
		break;
		default:
			System.out.println("Invalid operator sected!");
}}}