package day55_ABSTRACTION;
public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println("DOG");
	}
	@Override
	public void eat() {
		System.out.println("");
	}
}