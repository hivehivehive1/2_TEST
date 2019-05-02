package day37_Array_LIST;
import java.util.*;
import java.util.ArrayList;
public class Shopping {
	public static void main(String[] args) {
		ArrayList<String> shoppingLIST = new ArrayList<>();
		shoppingLIST.add("paper towel");
		shoppingLIST.add("dish soap");
		shoppingLIST.add("trash bag");
		shoppingLIST.add("clorox");
		shoppingLIST.add("gloves");
		shoppingLIST.add("shovel");
		//print number of items
		int count = shoppingLIST.size();
		System.out.println("Total count: " + count); //Total count: 6
		//print all items in single line
		System.out.println(shoppingLIST.toString()); //[paper towel, dish soap, trash bag, clorox, gloves, shovel]
		//print first and last item
		System.out.println(shoppingLIST.get(0) + " | " + shoppingLIST.get(count - 1)); //paper towel | shovel
		//remove
		shoppingLIST.remove(0);
		shoppingLIST.remove("shovel");
		System.out.println(shoppingLIST); //[dish soap, trash bag, clorox, gloves]
		System.out.println(shoppingLIST.get(0)); //dish soap
	
System.out.println("=================================================");
//FOR EACH loop can be used only for reading
//we can't modify list inside for each loop
		for(String item : shoppingLIST) {
			System.out.print(item + ", ");
		}
System.out.println();
		//remove all items at once
		shoppingLIST.clear();
		System.out.println(shoppingLIST.toString());
}}