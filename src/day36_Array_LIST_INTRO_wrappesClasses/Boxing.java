package day36_Array_LIST_INTRO_wrappesClasses;
public class Boxing {
	public static void main(String[] args) {
		//AUTOBOXING > primetive > object
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		System.out.println(n);
		
		//UnBOXING > object > primetive
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		long l1 = new Long(60000000); //UnBoxing
		Long l2 = new Long(1111111111L); //no boxing
		long l3 = l2; //auto - UnBoxing
		Long l4 = l3; //auto - boxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; 

}}