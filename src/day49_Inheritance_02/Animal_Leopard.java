package day49_Inheritance_02;

public class Animal_Leopard extends Animal{
	public Animal_Leopard() {
		super(); //call parent class NO-ARGS constructor
		System.out.println("Leopard constractor");
		setType("Leopard");
	}
	public Animal_Leopard(String type) {
		super(type); //all Animal(String type) constractor
		System.out.println("Leopard one-arg constructor");
	}
}