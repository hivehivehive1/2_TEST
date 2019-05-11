package day42_Custom_class_ENCAPSULATION;
import java.util.*;	
public class Starbucks {
	public static void main(String[] args) {
		//declare on array that can store 2 Coffe object
		//int[] nums = new int[2];
		//String[] str = new String[3];
		//str[0] = "Java"
		//declare coffeArray that can stroe 2 coffee objects
		Coffe[] coffeeArray = new Coffe[2];
		//crate coffe object and assign to index0
		coffeeArray[0] = new Coffe();
		//acces coffe object in index 0 and set data
		coffeeArray[0].setCoffeeInfo("McCofee 3 in 1", "PACK", 0.6, 666);
		//acces coffe object in index 0 and call method getCoffeInfo
		coffeeArray[0].getCoffeInfo();
		//create a single object first
		Coffe latte = new Coffe();
		//assign data
		latte.setCoffeeInfo("Caffe Latte", "Grande", 3.85, 190);
		//assign the latte object to index 1 of the array
		coffeeArray[1] = latte;
		//print data from object in index 1
		coffeeArray[1].getCoffeInfo();
}}