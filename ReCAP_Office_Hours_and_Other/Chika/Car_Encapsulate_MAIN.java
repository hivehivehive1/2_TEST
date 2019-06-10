package Chika;
public class Car_Encapsulate_MAIN {
	private String brand;
	private String model;
	private String color;
	private int numOfDoors;
	
	public Car_Encapsulate_MAIN(String brand, String model, String color, int numOfDoors) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	//	this.numOfDoors = numOfDoors;
		setNumOfDoors(getNumOfDoors());
	}
	
	
	@Override
	public String toString() {
		return "Car_Encapsulate [Brand: " + brand + ", Model: " + model + ", Color: " + color + 
				", numOfDoors: "+ numOfDoors + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		if(numOfDoors == 4 || numOfDoors == 2) {
			this.numOfDoors = numOfDoors;
		}else {
			System.out.println("WARNING! You can only enter 2 or 4 for this field");
			this.numOfDoors = -1;
		}
	}
///////////////////////////////////////////////////// MAIN ///////////////////////////////////////////
	public static void main(String[] args) {
	 // Car_Encapsulate car6 = new Car_Encapsulate("TESLA", "S", "RED", 5);
	 // System.out.println(car6.toString());

		Car_Encapsulate_MAIN car7 = new Car_Encapsulate_MAIN("BMW", "X6", "Black", 7);
		System.out.println(car7.toString());
}}