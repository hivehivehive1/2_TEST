package day53_Inheritance_06;
public class City_MAIN {
	public static void main(String[] args) {
		City bishkek = new City(123, "Bishkek");
		System.out.println(bishkek.toString());
		
		City dc = new City(444, "DC");
		City anotherCity = new City(444, "DC");
		
		if(dc.equals(anotherCity)) {
			System.out.println("Both are DC");
		}else {
			System.out.println("Does not equal");
		}
		
		System.out.println(dc.toString()); 			//Override
		System.out.println(anotherCity.toString()); //Override
		
		System.out.println(bishkek.hashCode());
		System.out.println(dc.hashCode());
		System.out.println(anotherCity.hashCode());
		
		Capital cap = new Capital(101, "Washigton DC", 800_000L);
		System.out.println(cap.toString());
		
		
		
		
}}