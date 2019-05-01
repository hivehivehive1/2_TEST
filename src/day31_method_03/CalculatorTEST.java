package day31_method_03;
public class CalculatorTEST {
	public static void main(String[] args) {
		Calculator.add(5, 5);       //call add method from Calculator class
		Calculator.multiply(5, 5);  //it will go to multiply method and run the code
		Calculator.subtract(5, 5);
		
		/*
		 * If you call a class from a different package, you will need to import it
		 * first.
		 * 
		 * package p1; public class A { public static void m1() {
		 * System.out.println("hello"); } }
		 * 
		 * package p2; import p1.A;
		 * 
		 * public class B { public static void main(String[] args) { A.m1(); } }
		 * 
		 */
}}