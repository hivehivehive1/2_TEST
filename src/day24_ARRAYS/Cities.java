package day24_ARRAYS;
public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Nur-Sultan", "Moskow", "Bishkek", 
				           "OSHington", "Baltimore", "TALASCiti","NARYNTown"};
		System.out.println(cities.length); // 8 cities
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("B")) {
			System.out.println(cities[i]); // Bishkek
		    }
		}
		System.out.println();
//--------------FOR EACH----------------------------------------------------------
		for(String city: cities) {
			if(city.startsWith("N")) {
				System.out.println(city);
			}
		}
}}
