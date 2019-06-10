package day55_ABSTRACTION;
public class Vehicle_Baike extends Vehicle{
												//, String type, String powerSource
	public Vehicle_Baike(int wheels, double price) {
		super(wheels, price, "Bicycle", "a person");	
	}
	@Override
	public void move() {
		System.out.println("Cycling");
	}
}