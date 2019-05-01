package day32_method_04;
public class Cooking {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		cook("Omelette", " Eggs, Salt, Tomatoes, Green Pappers, Onions");
	}
	public static void cook(String dish, String ingredients) {
		System.out.println("~~~~~~~~~~~~~~" + dish.toUpperCase() + " RECIPE~~~~~~~~~~~~~~~~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~~~~~~~~~~~~~" + dish.toUpperCase() + " IS READY!~~~~~~~~~~~~~~");
	}
	public static void makePasta() {
		System.out.println("~~~~~~~~ITALIAN PASTA RECIPE~~~~~~~");
		add(" Water, Salt, Olive Oil");
		boil(2);
		add(" Spagetti Pasta");
		boil(9);
		mix(60);
		System.out.println("~~~~~~~~~ENJOY PASTA SHIT~~~~~~~~~~");
System.out.println();
	}
	public static void makePancakes() {
		System.out.println("==========PANCAKES RECIPE==========");
		add(" Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("==========ENJOY YOUR SHIT==========");
System.out.println();
	}
	public static void add(String ing) {
		System.out.println("Add" + ing);
	}
	public static void mix(int sec) {
		System.out.println("Mix for " + sec + " seconds");
	}
	public static void fry(int min) {
		System.out.println("Fry for " + min + " minutes");
	}
	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}
}