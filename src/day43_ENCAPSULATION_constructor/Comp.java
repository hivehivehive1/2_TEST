package day43_ENCAPSULATION_constructor;
public class Comp {
	
	private String brand;
	private String os;
	private double price;
	
	//add a constructor
	public Comp() {
		System.out.println("Computer constructor...");
		brand = "unknown";
		os = "unknown";
	}
	public Comp(String brand, String os, double price) {
		this.brand = brand;
		this.os = os;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Comp [Brand = " + brand + ", OS = " + os + ", Price = " + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}