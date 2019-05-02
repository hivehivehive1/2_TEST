package day37_Array_LIST_set_add_clear_isEmpty;
import java.util.*;
public class ArraysASList {
	public static void main(String[] args) {
		List<String> cars = Arrays.asList("Tesla", "RR", "Lambo", "Maybach", "Benttly");
			System.out.println(cars); 	//[Tesla, RR, Lambo, Maybach, Benttly]
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
			System.out.println(nums);			//[1, 2, 3, 4, 5]
			System.out.println(nums.size());	// 5
System.out.println("===========================================================");
//creat ArrayLIST price
//Assign 10 values using Arrays.asList method
List<Double> prices = Arrays.asList(111.1, 222.2, 333.3, 444.4, 555.5, 666.6, 777.7, 888.8, 999.9, 1.1);	
			System.out.println(prices);
			//calculate sum of all prices
			double sum = 0;
			for(Double price : prices) {
				sum += price;
			}
			System.out.println(sum); //500.6
			
			double sum2 = 0;
			for(int i = 0; i < prices.size(); i++) {
				sum2+= prices.get(i);
			}
			System.out.println(sum2); //500.6
			
			//create new LIST expensive
			//add prices that are more than 100 from prices LIST
			List<Double> expensive = new ArrayList<>();	
			for(Double price : prices) {
				if(price > 100.0) {
					expensive.add(price);
				}
			}
			System.out.println("Expensive: " + expensive);
		//Expensive: [111.1, 222.2, 333.3, 444.4, 555.5, 666.6, 777.7, 888.8, 999.9]
		
			//remove all expensive prices from prices
			//prices.removeAll(expensive);
			//System.out.println(expensive.toString());
}}