package day08_ENDchap2;

public class ExplicitCasting {

	public static void main(String[] args) {
		System.out.println(10 / 2.0); //5.0 result is double
		System.out.println(10.0 / 2); //5.0
		
		int result = (int)(10 / 2.0);
		System.out.println(result); //5
		
		int rent1 = 987;
		int rent2 = 1100;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1+rent2+rent3+rent4) / 4;
		double average1 = (rent1+rent2+rent3+rent4) / 4.0;
		System.out.println("Average: " + average); //1053.0
		System.out.println("Average: " + average1);//1053.75
		
//		implicit is automatic, from smaller type to larger
//		explicit needs to typed exact type using paranthesis
		
		double d = 40.2;
		int i = (byte) d;
		System.out.println(d);
		// in above statment both explicit and implicit casting happening.
		
		//explicit: double > byte,
		//implicit: byte > int.

}}