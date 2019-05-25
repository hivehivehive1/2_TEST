package day50_Inheritance_03;
public class Animal_Dog extends Animal {
	public void speak() {
		System.out.println("Dog is saying Guf guf");
	}
	public void move(int steps) {
		System.out.println("Dog is moving " + steps + " steps");
	}
}