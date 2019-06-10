package Chika;
public class Cars_TEST {

	public static void main(String[] args) {
		// create a car object instance of a class
//		Car car1 = new Car();
//		System.out.println(car1.toString());
	
		Car car2 = new Car("RR", "Phantom", "White", 4);
		System.out.println(car2.toString());
		
		Car car3 = new Car("RR", "Ghost", "Black", 2);
		System.out.println(car3.toString());
		
//		Car car4 = new Car("Bugatti", 2);
//		System.out.println(car4.toString());
		
		Car car5 = new Car("not RR", "not Ghost", "Blue", 10);
		System.out.println(car5.toString());
		
//Here comes the encapsulation
//Data hiding so that we avoid misuse of my variable and also 
//I have a control and variable assigment to the object
}}