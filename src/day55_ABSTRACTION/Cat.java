package day55_ABSTRACTION;
public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println("CAT");
	}
	@Override
	public void eat() {
		System.out.println(getName() + " eat");
	}
}