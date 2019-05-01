package day08_ENDchap2;
public class CastingPrimetives {
	public static void main(String[] args) {
		// Cast double value to exit
		int i = (int)3.4; // (int)will remove .4
		System.out.println("i : " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("Price: " + price);      //230.5
		System.out.println("Dollars: " + dollars);  //230
		
		// WHOLE NUMBERS. byte, short, int
		
		int count = 128;
		byte byteCount = (byte)count;
		System.out.println("byteCount: " + byteCount);  //-128
		
		long longValue = 111L;
		int intValue = (int)longValue;
		System.out.println("Int value: " + intValue); //
		
		int large = 5555;
		short small = (short) large;
		System.out.println("small: " + small);
		
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: " + result); //250
		
		byte b = 123;
		int a = b;
		System.out.println(b);	
}}