package day12_SWITCH_ternary;
import java.util.Scanner;
public class Calculator_V01 {
	public static void main(String[] args) {
		//Get numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		//Get operators
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = scan.next();
		double result = 0.0;
		// perform calculation and display result
			  if(operator.equals("+")) {
			result = num1 + num2;
		}else if(operator.equals("-")) {
			result = num1 - num2;
		}else if(operator.equals("*")) {
			result = num1 * num2;
		}else if(operator.equals("/")) {
			result = num1 / num2;
		}else if(operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator sected: " + operator);
			return; //Stop! Do not execute the remaining code. STOP HERE
		}
			  System.out.println("Result: " + result);
}}