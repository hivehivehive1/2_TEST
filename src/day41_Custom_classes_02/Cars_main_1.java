package day41_Custom_classes_02;
public class Cars_main_1 {
	
	public static void main(String[] args) {
		Cars_NOT_main_1 car1 = new Cars_NOT_main_1();
		car1.make = "RR";
		car1.model = "Phantom";
		car1.color = "Metalic";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);
		car1.drive();
		
		System.out.println("Before speed: " + car1.currentSpeed);
		car1.accelarate(20);
		System.out.println("After speed: " + car1.currentSpeed);
//================================================================================
		
		RR rr = new RR();
		System.out.println(rr.make);
		rr.model = "Phantom";
		rr.showPrice();
		System.out.println("Car Price: " + rr.price);
	
		RR rr2 = new RR();
		rr2.model = "Ghost";
		rr2.showPrice();
}}