package day43_ENCAPSULATION_constructor;
public class TESLA {
	private String model;
	private int range;
	private double zeroTO60;
	private double price;
	private boolean selfDriving;
	
	public String toString() {
		return "TESLA [Model = " + model + ", Range = " + range + ", Accel = " + zeroTO60 + 
			   ", Price = " + price + ", Self Driving = " + selfDriving + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getZeroTO60() {
		return zeroTO60;
	}
	public void setZeroTO60(double zeroTO60) {
		this.zeroTO60 = zeroTO60;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
//1) ///////////////////////returns//////////////////////////////////////////////////
	public boolean isValidModel(String model) {
//		model = model.toLowerCase();
//		if(model.equals("model s") || model.equals("model 3") || model.equals("model x") ||
//		   model.equals("model y") || model.equals("roadster")) {
//		return true;
//		}
//		return false;
//	}
//2) ///////////////////////////////////////////////////////////////////////////////////////	
	return 	model.equals("model s") || 
			model.equals("model 3") || 
			model.equals("model x") ||
			model.equals("model y") || 
			model.equals("roadster");
//3) ///////////////////////////////////////////////////////////////////////////////////////
//		switch(model) {
//		case "model ss":
//		case "model 3":
//		case "model x":
//		case "model y":
//		case "roadster":
//			return true;
//		default:
//			return false;	
		}
/////////////////////////////////////////////////////////////////////////////////////////////
public void setTeslaInfo(String model, int range, double zeroTO60, double price, boolean selfDriving) {
		//call setter methods for each parameter
		//this.model = model;
		setModel(model);
		setRange(range);
		setZeroTO60(zeroTO60);	
		setPrice(price);
		setSelfDriving(selfDriving);
/////////////////////////////////////////////////////////////////////////////////////////////
		
		
}}