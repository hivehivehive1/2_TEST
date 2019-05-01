package day08_ENDchap2;

public class ImlicitCasting {

	public static void main(String[] args) {
		//automatic casting from smaller to large type
		short shortValue = 12345;
		int intValue = shortValue; //(int) optional, no need.
		System.out.println("int value " + shortValue);

		double price = 111;
		System.out.println("Price after casting: " + price);
		
		int price1 = 11111;
		double dPrice = price1;
		System.out.println("dPrice after casting: " + dPrice);
	}

}
