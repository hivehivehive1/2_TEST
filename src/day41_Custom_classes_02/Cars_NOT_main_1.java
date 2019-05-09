package day41_Custom_classes_02;
public class Cars_NOT_main_1 {
	
	String make;
	String model;
	String color;
	int currentSpeed;
	
	public void printCarInfo() {
		String info = "Car make [" + make + " ], model [ " + model +
				" ], color [ " + color + " ], currentSpeed [ " + currentSpeed + " ]";
		System.out.println(info);
	}
	//"Ford is driving at currentSpeed mph, following speed limit - 55"
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed +
					" mph, following the speed limit -" + speedLimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed +
					" mph, over the speed limit -" + speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make + " " + model + " is driving ...");
	}
	
	public void accelarate(int mph) {
		currentSpeed += mph;
	}
}