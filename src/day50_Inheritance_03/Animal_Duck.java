package day50_Inheritance_03;
public class Animal_Duck extends Animal{
	public void speak() {
		System.out.println("Duck is saying Cria cria");
	}
	public void move(int steps) {
		System.out.println("Duck is moving " + steps + " steps");
	}
}