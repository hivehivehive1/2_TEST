package day08_ENDchap2;
public class Relationals {
	public static void main(String[] args) {
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1 >= d2); //true
		boolean check = d1 >= d2;
		System.out.println("check: " + check); //true
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		System.out.println(ch2 > ch1); //true j>a
		System.out.println(ch1 > ch3); //true a>A (a-97 and A-65)

		boolean b = true == false;
		System.out.println("B: " + b); //false
		b = true != false;
		System.out.println("B: " + b); //true	
}}