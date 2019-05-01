package day21_LOOPS_practice1;
import java.util.Scanner;
public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int itemsCount = 0;
		System.out.println("How many items are you purchasing?");
		itemsCount = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";
		for(int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item " + count + " ?");
			String itemName = scan.next();
			System.out.println("How much is " + itemName + " ?");
			double itemPrice = scan.nextDouble();
			//add itemName to items and itemPrice to totalPrice
			items += itemName + ", ";
			totalPrice += itemPrice;
		}
		System.out.println("Your items: " + items);
		System.out.println("Your total Price: $" + totalPrice);
}}
