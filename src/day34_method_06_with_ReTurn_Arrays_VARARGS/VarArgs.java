package day34_method_06_with_ReTurn_Arrays_VARARGS;
import java.util.*;
public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue", "yellow");	 //3 ARR value
		printWords("grey"); 					 // 1 ARR value
		printWords(); 							 //empty ARR
		String[] myPets = {"cat", "horse", "dog", "sheep", "TAIGAN"};
		printWords(myPets);
		
		System.out.println(sum(3, 5, 10)); 		 //18
		System.out.println(sum(111, 222, 333));  //666
		
		int budget = 200; 						 //Within budget
		if(sum(10, 45, 110, 30) <= budget) { 
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 43, 567, 12, 34, 5);
		System.out.println("Total: " + total); 	 //Total: 895
		
		cook("SHASHLYK", "ET , ET, ET, EEEEEET");
		cook("5BARMAK", "EEEET, KAAAMYR");
		
		shoppingList(100, "KYRGYZ BATINKEee");
		
	}
		public static void printWords(String... words) {
			//handle it like an ARRAY
			for(String w : words) {
				System.out.println(w);
			}
		}
		// sum(10, 30, 40); ==> 80
		// sum(30, 40);     ==> 70
		public static int sum(int... nums) {
			int sum = 0;
			for(int n : nums) {
				sum +=n; //sum = sum + n  <== long way
		}
		return sum;
		}
		public static void cook(String name, String... ings) {
			System.out.print("Food: " + name);
			System.out.println(Arrays.toString(ings));
		}
		public static void shoppingList(int totalPrice, String... items) {
			System.out.print("Total price: " + totalPrice);
			System.out.println(Arrays.toString(items));
		}
}