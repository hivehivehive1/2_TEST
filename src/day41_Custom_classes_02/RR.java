package day41_Custom_classes_02;
public class RR {
	
	String make = "RR";
	String model;
	double price;
	
	public void showPrice() {
		switch(model) {
		case "Phantom":
			price = 180000;
			break;
		case "Down":
			price = 160000;
			break;
		case "Ghost":
			price = 160000;
			break;
		default:
			System.out.println(model + " is not available");
			price = 0.0;
		}
		System.out.println("Price: " + price);
		
}}