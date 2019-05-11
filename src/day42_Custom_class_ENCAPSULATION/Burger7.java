package day42_Custom_class_ENCAPSULATION;
public class Burger7 {
	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "Cowboy";
		String[] ings = {"onion crisps", "american cheese", "pickles", "lettuce", "b7 sauce"};
		burger1.ingredients = ings;

		System.out.println(burger1.name);
		//print first ingredients
		System.out.println(burger1.ingredients[0]);
		//print all ingredients using a loop
		for(String ing : burger1.ingredients) {
			System.out.println(ing);
		}
}}