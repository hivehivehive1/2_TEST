package day07_Scanner;

public class EnoughPizza {
		//slices in pizza -> 8
		// slices per student -> 2
	public static void main(String[] args) {
		int pizzaCount = 30;
		int studentsCount = 145;
		boolean isEnoughPizza = pizzaCount * 8 >= studentsCount * 2;
		isEnoughPizza = pizzaCount / 8 >= studentsCount * 2;
		
		System.out.println("Is enough pizza: " + isEnoughPizza);
				
		

	}

}
