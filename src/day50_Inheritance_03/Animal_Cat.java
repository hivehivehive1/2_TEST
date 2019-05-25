package day50_Inheritance_03;
public class Animal_Cat extends Animal{
	public void speak() {
		System.out.println("Cat is saying Miau Miau");
	}
	public void move(int steps) {
		System.out.println("Cat is moving " + steps + " steps");
	}
}