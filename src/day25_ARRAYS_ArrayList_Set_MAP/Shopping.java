package day25_ARRAYS_ArrayList_Set_MAP;
public class Shopping {
	public static void main(String[] args) {
		String[] prods = {"Vodka", "TAH", "Shoro", "Shaurma","Cheburek"};
		double[] prices = {11.1, 22.22, 33.3, 44.44, 55.5};
		int[] itemsID = {111, 222, 333, 444, 555};
//Print count of products:
		System.out.println("Products count: " + prods.length); //Products count: 5
System.out.println("******************************************5_X_5*");
//check if products, prices and itemsID have same count
		if(prods.length == prices.length && prods.length == itemsID.length) {
			System.out.println("Shopping list looks good"); //good! 5 to 5
	}else {
		System.out.println("Something is WRONG");
		return;
}System.out.println("************************************PRINT_PRODS*");
//loop though products and print each one in separate line
		for(String p : prods) {
			System.out.println(p);
}System.out.println("******************************************PRICE*");
//price --> for loop
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
}System.out.println("****************************************Reverse*");
//print last itemsID
//		System.out.println(itemsID[itemsID.length - 1]); //LAST 555  <++++
//itemsId --> print this in reverse order using a loop
		for(int i = itemsID.length - 1; i >= 0; i--) {
		System.out.println(itemsID[i]); // form 555 to 444, 333, 222, 111
}System.out.println("**************************YOUR SHOPPING RECEIPT*");	
//print a report. with a total price
//Item 1: 111 - Vodka - $11.1
//Total price:
		double totalPrice = 0.0;
		for(int i = 0; i < prods.length; i++) {
	System.out.println("Item " + (i + 1) + ": " + itemsID[i] + " - " + prods[i] + " - $" + prices[i]);
			totalPrice += prices[i];
		}
		System.out.println("Total Price is: $" + totalPrice); //Total Price is: $166.56
System.out.println("***********************************MAX_PRICE_v1*");
//Find the most expensive item in your list and print it as a report
//Loop and find. Do not use Arrays class
		int maxIndex2 = 0;
		double maxPrice2 = 0;

		for(int m = 0; m < prices.length; m++) {
			if(prices[m] > maxPrice2) {
				maxPrice2 = prices[m];
				maxIndex2 = m;
			}
		}											//555 - Cheburek - $55.5
		System.out.println(itemsID[maxIndex2] + " - " + prods[maxIndex2] + " - $" + maxPrice2);
System.out.println("***********************************MAX_PRICE_v2*");
		double maxIndex = 0;
		double maxPrice = 0;

		maxIndex = Integer.MIN_VALUE;
		for(int m = 0; m < prices.length; m++) {
			if(prices[m] > maxIndex) {
				maxIndex = prices[m];
			}
		}
		System.out.println("Max price: " + maxIndex); // Max price: 55.5
}}