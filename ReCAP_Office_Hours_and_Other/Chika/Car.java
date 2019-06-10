package Chika;
public class Car {
	private String brand;
	private String model;
	private String color;
	private int numOfDoors;
	@Override
	public String toString() {
		return "Car [Brand: " + brand + ", Model: " + model + ", Color: " + color + ", NumOfDoors: " + numOfDoors + " ]";
	}
	public Car() {
		System.out.println("I am constructor without params");
	}
	//Overloading constractor
	public Car(String brand, String model, String color, int numOfDoors) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.numOfDoors = numOfDoors;
	}
	//Overloading with 2 args
	public Car(String brand, int numOfDoors) {
		this.brand = brand;
		this.numOfDoors = numOfDoors;
		System.out.println("I'm in 2 args");
	}
}