package day49_Inheritance_02_FOR_Device;

import day49_Inheritance_02.Device;
//IPad       IS-A Device. IPad is a SubClass in different packeg
public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book " + title + " using " + brand + " tablet");
		System.out.println("Model - " + model);
	  //System.out.println("Price: " + price); not inherited, NOT VISIBLE!!!
	}
}