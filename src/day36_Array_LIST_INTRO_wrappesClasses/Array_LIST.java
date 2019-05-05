package day36_Array_LIST_INTRO_wrappesClasses;
import java.util.*;
public class Array_LIST {
	public static void main(String[] args) {
		//Create an arrayList
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		//assign values into arraylist
		names.add("Adilet");
		names.add("Urmat");
		names.add("Aigul");
		names.add("Nurbek");
		names.add("Ulan");
		
		nums.add(111);
		nums.add(222);
		nums.add(333);
		nums.add(444);
		nums.add(555);
		
		//read from ArrayList
		System.out.println(names);		  //[Adilet, Urmat, Aigul, Nurbek, Ulan]
		System.out.println(names.get(0)); //Adilet
		System.out.println(nums); 		  //[111, 222, 333, 444, 555]
		System.out.println("Names count: " + names.size()); //Names count: 5
		System.out.println("Nums count: " + nums.size());   //Nums count: 5
}}