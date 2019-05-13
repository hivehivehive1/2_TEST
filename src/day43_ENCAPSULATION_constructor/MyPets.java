package day43_ENCAPSULATION_constructor;
public class MyPets {
	public static void main(String[] args) {
		Pet pet1 = new Pet("Dog", "Sharik");
		Pet pet2 = new Pet("Cat", "SHIT");
		Pet pet3 = new Pet("Cat", "BULLSHIT");
		Pet pet4 = new Pet("Fish", "Shark");
		Pet pet5 = new Pet("Goat", "SUKA");
		Pet pet6 = new Pet("Bird", "Petuh");
		
		pet1.speak();
		pet2.speak();
		pet3.speak();
		pet4.speak();
		pet5.speak();
		pet6.speak();
		
		System.out.println(pet1.toString());
		System.out.println(pet2.toString());
		System.out.println(pet3.toString());
		System.out.println(pet4.toString());
		System.out.println(pet5.toString());
		System.out.println(pet6.toString());

}}