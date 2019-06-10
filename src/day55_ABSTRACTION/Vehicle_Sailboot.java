package day55_ABSTRACTION;
public class Vehicle_Sailboot extends Vehicle {
	
	private int length;

//SUPER CONSTRACTOR							//, String type, String powerSource - DELITE IT DON'T NEED 
	public Vehicle_Sailboot(double price, int length) {
		super(0, price, "SailBoot", "wind");
		this.setLength(length);
	}
	@Override
	public void move() {
		System.out.println("Sails...");
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}