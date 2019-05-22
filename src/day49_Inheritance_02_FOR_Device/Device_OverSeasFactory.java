package day49_Inheritance_02_FOR_Device;

import day49_Inheritance_02.Device;
//Non-Sub class in different package
public class Device_OverSeasFactory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "SamSung";
	  //dv.model = "3200";         //NOT VISIBLE
	  //dv.price = 1000;           //NOT VISIBLE
	  //dv.country = "CHURKISTAN"; //NOT VISIBLE!
}}