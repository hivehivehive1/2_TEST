package day39_arraylist_04;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
//1) FOR EACH: Print each city in same line separated by |
        for(String c : cities) {
        		System.out.print(c + " | ");
}//Paris | Berlin | Tokyo | New York | Pittsburgh | Madrid | Moscow | Istanbul | Washington D.C. | Amsterdam | Zurich | Singapore | Milan | Toronto | London 
System.out.println();
//2) FOR LOOP: Print each city in same line separated by |
        	for(int c = 0; c < cities.size(); c++) {
        		System.out.print(cities.get(c) + " | ");
}//Paris | Berlin | Tokyo | New York | Pittsburgh | Madrid | Moscow | Istanbul | Washington D.C. | Amsterdam | Zurich | Singapore | Milan | Toronto | London | 
        System.out.println();
//3) ToString. Print each City all uppercase
        System.out.println(cities.toString().toUpperCase());
        System.out.println(cities);
//4) Make each city all uppercase
        String paris = cities.get(0).toUpperCase();
        cities.set(0, paris);
        System.out.println(cities.get(0));
        
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int c = 0; c < cities.size(); c++) {
        		String city = cities.get(c).toUpperCase();
        		cities.set(c, city);
        }
        System.out.println(cities.toString());
//[PARIS, BERLIN, TOKYO, NEW YORK, PITTSBURGH, MADRID, MOSCOW, ISTANBUL, WASHINGTON D.C., AMSTERDAM, ZURICH, SINGAPORE, MILAN, TORONTO, LONDON]
        
//5) Find the longest and shortest cities
        String longestCity = "", shortestCity = "";
        
        for(String city : cities) {
        	if(city.length() > longestCity.length()) {
        		longestCity = city;
        	}
        }
        System.out.println("Longest City: " + longestCity); //Longest City: WASHINGTON D.C.
        shortestCity = cities.get(0);
        for(String city : cities) {
        	if(city.length() < shortestCity.length()) {
        		shortestCity = city;
        	}
        }
        System.out.println("Shortest City: " + shortestCity); //Shortest City: PARIS
	
	ArrayList<String> citiesMoreThan6 = new ArrayList<>();
//6) Assign all cities that have more than 6 chars to this arraylist
		for(String c : cities) {
			if(c.length() > 6) {
				citiesMoreThan6.add(c);
			}
		}
		System.out.println(citiesMoreThan6);
//[NEW YORK, PITTSBURGH, ISTANBUL, WASHINGTON D.C., AMSTERDAM, SINGAPORE, TORONTO]	
}}