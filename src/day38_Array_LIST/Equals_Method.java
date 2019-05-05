package day38_Array_LIST;
import java.util.*;
public class Equals_Method {
	public static void main(String[] args) {
		List<String> friends1 = new ArrayList<>();
		List<String> friends2 = new ArrayList<>();
		
		friends1.add("Janymka");
		friends1.add("Adik");
		friends1.add("Urma");
		friends1.add("Tutka");
		
		friends2.add("Janymka");
		friends2.add("Adik");
		friends2.add("Urma");
		friends2.add("Tutka");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same Friends");
		}else {
			System.out.println("");
		}	
}}