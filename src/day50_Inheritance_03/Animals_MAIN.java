package day50_Inheritance_03;
public class Animals_MAIN {
	public static void main(String[] args) {
		Animal an = new Animal();
		Animal_Cat cat = new Animal_Cat();
		Animal_Dog dog = new Animal_Dog();
		Animal_Duck duck = new Animal_Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(20);
		cat.move(201);
		dog.move(202);
		duck.move(203);
}}