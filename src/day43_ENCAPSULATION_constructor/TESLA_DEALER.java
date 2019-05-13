package day43_ENCAPSULATION_constructor;
public class TESLA_DEALER {
public static void main(String[] args) {
	TESLA tesla = new TESLA();
	tesla.setModel("Model S");
	tesla.setRange(500);
	tesla.setZeroTO60(2);
	tesla.setPrice(100000);
	tesla.setSelfDriving(true);
	
	System.out.println("Model: " + tesla.getModel()); 		//Model: Model S
	System.out.println("Range: " + tesla.getRange()); 		//Range: 500
	System.out.println("Accel: " + tesla.getZeroTO60());    //Accel: 2.0
	System.out.println("Price: " + tesla.getPrice()); 		//Price: 100000.0
	System.out.println("SDriv: " + tesla.isSelfDriving());  //SDriv: true
	
	System.out.println(tesla.toString());
//TESLA [Model = Model S, Range = 500, Accel = 2.0, Price = 100000.0, Self Driving = true]
	
	TESLA myTesla = new TESLA();
	myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
	System.out.println(myTesla.toString());
//TESLA [Model = Roadster, Range = 620, Accel = 1.9, Price = 250000.0, Self Driving = true]
	
	//tesla , myTesla
	if(tesla.getZeroTO60() > myTesla.getZeroTO60()) {
		System.out.println("Faster model: " + myTesla.getModel());  //Faster model: Roadster
		System.out.println("0-60 speed: " + myTesla.getZeroTO60()); //0-60 speed: 1.9
	}else {
		System.out.println("Faster model: " + tesla.getModel());
		System.out.println("0-60 speed: " + tesla.getZeroTO60());
	}
//////////////////////////////////Model 444///////////////////////////////////////////////////
	System.out.println(testDrive("Model 444"));
//TESLA [Model = Model 444, Range = 500, Accel = 2.5, Price = 85000.0, Self Driving = false]

///////////////////////////////Model 333//////////////////////////////////////////////////////	
	TESLA testCar = testDrive("Model 333");
	System.out.println(testCar.toString());
//TESLA [Model = Model 333, Range = 500, Accel = 2.5, Price = 85000.0, Self Driving = false]
	
////////////////////////////Purchasing///////////////////////////////////////////////////////	
		buy(myTesla);
		buy(tesla);
}//main mathod
	public static void buy(TESLA car) {
		System.out.println("Purchasing: " + car.toString());
//Purchasing: TESLA [Model = Roadster, Range = 620, Accel = 1.9, Price = 250000.0, Self Driving = true]
//Purchasing: TESLA [Model = Model S, Range = 500, Accel = 2.0, Price = 100000.0, Self Driving = true]
		
//////////////////////////////////////////////////////////////////////////////////////////////
	}
	public static TESLA testDrive(String model) {
		TESLA car = new TESLA();
		car.setTeslaInfo(model, 500, 2.5, 85000, false);
		return car;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////	

}