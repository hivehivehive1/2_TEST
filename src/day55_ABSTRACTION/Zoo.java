package day55_ABSTRACTION;
public class Zoo {
	public static void main(String[] args) {
	//	Animal animal = new Animal(); //Cant instantiate the type Animal
		Cat KOTOK = new Cat("SUKA");
		KOTOK.speak();
		KOTOK.eat();
		KOTOK.setName("SOBACHKA");
		
		Dog TALLIAK = new Dog("KABEL");
		TALLIAK.speak();
		TALLIAK.eat();

}}