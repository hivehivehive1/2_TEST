package day06_Operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		int students = 45;
		System.out.println("Students: " + students);
		
		students = students + 5;
		System.out.println("Students: " + students);
		
		students = students - 2;
		System.out.println("Students: " + students);
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		
		teachers += 2; //increase teachers by 2
		System.out.println("Teachers: " + teachers);
		
		teachers -=5; //decrease teachers by 5
		System.out.println("Teachers: " + teachers);
		
		int i = 10;
		System.out.println(i += 8);
		System.out.println(i -= 8);
		System.out.println(i *= 8);
		System.out.println(i /= 8);
		System.out.println(i %= 8);
		
		int cars = 12;
		cars *= 2;
		System.out.println("Cars: " + cars);
		
		cars += cars;
		System.out.println("Cars: " + cars);
		
		int shoes = 20;
		shoes /= 4;
		System.out.println("Shoes: " + shoes);
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price); //50.5
		
		int minutes = 66;
		minutes %= 60;
		System.out.println("Reamining :" + minutes); //6
		
		int pennies = 550;
		pennies %= 100;
		System.out.println("Pennies lesft: " + pennies); //50
		
		int apples = 10;
		apples =-3;
		System.out.println(apples); //-3
	
	}
}
