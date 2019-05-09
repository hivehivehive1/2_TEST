package day41_Custom_classes_02;
public class Kitchen {
	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza with mushrooms");
		mic.turnOff();

}}