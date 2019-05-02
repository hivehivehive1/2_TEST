package day37_Array_LIST;
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
			System.out.print(city + ", ");
		}
		System.out.println();
		//print each city using for loop, separated by space
		for(int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + ", ");
}System.out.println();
		System.out.print("Removing - DC");
		cities.remove("DC");
		cities.remove("ALL CHURKAS");
System.out.println();
		System.out.print(cities.toString());
		

}}
