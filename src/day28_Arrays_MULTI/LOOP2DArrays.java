package day28_Arrays_MULTI;
import java.util.Arrays;
public class LOOP2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = {
		{"pepperoni", "pineapple"}, //0
		{"anchovies", "mushroom", "olives"}, //1
		{"4 chees"}, //2
		{"chiken", "tomatoes", "jalapenios", "onions"}, //3
		{"green pepper", "zuccini", "brocoli", "spinach", "shirimp"}}; //4
	//	System.out.println(Arrays.toString(pizzas[0]));
		
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + " - ");
			System.out.println(Arrays.toString(pizza));
	   }//  2-[pepperoni, pineapple]
		//  3-[anchovies, mushroom, olives]
		//	1-[4 chees]
		//	4-[chiken, tomatoes, jalapenios, onions]
		//  5-[green pepper, zuccini, brocoli, spinach, shirimp]
System.out.println("################################# FOR LOOP #################################");
		for(int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length + " - ");
			System.out.println(Arrays.toString(pizzas[i]));
		}
//				2 - [pepperoni, pineapple]
//				3 - [anchovies, mushroom, olives]
//				1 - [4 chees]
//				4 - [chiken, tomatoes, jalapenios, onions]
//				5 - [green pepper, zuccini, brocoli, spinach, shirimp]
System.out.println("============================================================================");
		for(String topping : pizzas[2]) {
			System.out.println(topping); //4 chees
}System.out.println("===========================================================================");
		int[][] students = {{4, 5, 6},{12, 5, 7},{23, 56, 12, 55, 3}};
//2 parts: OUTER loop and INNER loop
//outer loop will take each group
//inner loop will take each value/student ID
		for(int[] group : students) {
			for(int studentID : group) {
				System.out.print(studentID + ", ");
			}
 System.out.println();
}System.out.println("===========================================================================");
		int[][] nums = {{10, 20},{11, 22, 33, 44},{100, 300, 400},{111, 222, 333, 444, 555, 666}};
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.println(nums[i][j]);
			}
		}
	
	
}}