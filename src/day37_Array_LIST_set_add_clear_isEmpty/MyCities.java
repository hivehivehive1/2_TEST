package day37_Array_LIST_set_add_clear_isEmpty;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("NY");
		cities.add("DC");
		cities.add("BISHKEK");
		cities.add("CHOLPON-ATA");
		cities.add("LA");
		//print each city using for each loop seperated by space
		for(String city : cities) {
			System.out.print(city + ", "); //NY, DC, BISHKEK, CHOLPON-ATA, LA, 
		}
		System.out.println();
		//print each city using for loop, separated by space
		for(int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + ", "); //NY, DC, BISHKEK, CHOLPON-ATA, LA, 
		}	
System.out.println();
		System.out.print("Removing - DC");
		cities.remove("DC"); //[NY, BISHKEK, CHOLPON-ATA, LA]
		cities.remove("ALL CHURKAS"); //it will not remove or show error
System.out.println();
		System.out.println(cities.toString());
		//is EMPTY?
		System.out.println("is list empty? " + cities.isEmpty()); //is list empty? false
		
		cities.add(0, "Bishkek");
		System.out.println(cities.toString()); //[Bishkek, NY, BISHKEK, CHOLPON-ATA, LA]
		
		cities.add(1, "Nur-Sultan");
		System.out.println(cities.toString()); //[Bishkek, Nur-Sultan, NY, BISHKEK, CHOLPON-ATA, LA]
		
		cities.set(2, "Moscow");
		System.out.println(cities.toString()); //[Bishkek, Nur-Sultan, Moscow, BISHKEK, CHOLPON-ATA, LA]
		//find Sterling in the list and give the index
		int i = cities.indexOf("Nur-Sultan");
		System.out.println("Nur-Sultan index: " + i);
		cities.set(i, "Miami");
		System.out.println(cities.toString()); //[Bishkek, Miami, Moscow, BISHKEK, CHOLPON-ATA, LA]
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Empty? " + empty); //Empty? true
		
		
}}