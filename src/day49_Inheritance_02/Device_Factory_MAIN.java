package day49_Inheritance_02;
public class Device_Factory_MAIN {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "LG";
		dv.model = "3300";
		dv.price = 2500;
	  //dv.country = "USA"; NOT VISIBLE, PRIVATE
}}