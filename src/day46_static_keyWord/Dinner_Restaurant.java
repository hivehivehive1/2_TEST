package day46_static_keyWord;
public class Dinner_Restaurant {
	public static void main(String[] args) {
		Dinner Mom = new Dinner();
		Dinner Kid = new Dinner();
		Dinner Dad = new Dinner();
		System.out.println("Total slices: " + Dinner.pizzaSlices);
		
		Dad.takeASlice();
		Mom.takeASlice();
		Kid.takeASlice();
		System.out.println("Total slices: " + Dinner.pizzaSlices);
		System.out.println("Total Slices: " + Dad.pizzaSlices);
		
		Kid.takeASlice(3);
		Dad.takeASlice(2);
		Mom.takeASlice();
		System.out.println("Total slices: " + Mom.pizzaSlices);
		System.out.println("Total slices: " + Dinner.pizzaSlices);
}}