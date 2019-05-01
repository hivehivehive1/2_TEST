package day15_Strings_manipulatuion;
public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@")); //true
		
		String list = "potatoes, apples, tomatoes, eggs, milk, meat";
		//check if apples is in the shopping list
//		if(list.contains("apples")) {
//		System.out.println("Apples are there");
//		}else {
//			System.out.println("NO Apples!");
//		}
		
		boolean has = list.contains("eggs");
		System.out.println("Contains eggs: " + has);
		
		boolean hasGANJA = list.contains("GANJA");
		System.out.println("Contains GANJA: " + hasGANJA);
		
//		email = "name@yahoo.com";
//		if (email.contains("yahoo")) {
//			System.out.println("It is yahoo email");
//		}else if(email.contains("Yahoo account")) {
//			System.out.println("@gmail");
//		}else if(email.contains("@hotmail")) {
//			System.out.println("Hotmail account");
//		}
		
//		String etsyTitle = "Wooden spoon | Etsy";
//		if(etsyTitle.contains(" | ")) {
//			System.out.println("Pipe | is there as expected");
//		}else {
//			System.out.println("Pipe is not detected");
//		}	
//		String name = "PUTIN";
//		if(name.contains("P") || name.contains("N")) {
//			System.out.println("P and N is present");
//		}else {
//			System.out.println("a or e is missing");
		
}}
