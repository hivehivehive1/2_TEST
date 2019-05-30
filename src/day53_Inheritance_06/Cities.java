package day53_Inheritance_06;

public class Cities {
	public static void main(String[] args) {
		City bishkek = new City(312, "Bishkek");
		System.out.println(bishkek.toString());

		City ny = new City(666, "NY");
		City anotherCity = new City(666, "NY");

		if (ny.equals(anotherCity)) {
			System.out.println("Both are NY");
		} else {
			System.out.println("Does not equal");
		}

		System.out.println(ny.toString());
		System.out.println(anotherCity.toString());

		System.out.println(bishkek.hashCode());
		System.out.println(ny.hashCode());
		System.out.println(anotherCity.hashCode());

		Capital cap = new Capital(101, "Washington DC", 800_000L);
		System.out.println(cap.toString());
	}
}