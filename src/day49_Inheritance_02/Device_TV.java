package day49_Inheritance_02;
//TV is a child/sub class in same package
public class Device_TV extends Device {
	public void watch() {
		System.out.println("Watching TV - " + brand + " model: " + model);
		System.out.println("Price: " + price);
		System.out.println("Price: " + price); //NOT INHERITED. NOT VISIBLE
	}
}