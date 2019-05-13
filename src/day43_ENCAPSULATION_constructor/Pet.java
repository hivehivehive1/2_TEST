package day43_ENCAPSULATION_constructor;
public class Pet {
	private String type;
	private String name;

	@Override
	public String toString() {
		return "Pet [type = " + type + ", name = " + name + "]";
	}
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	public Pet() {
		System.out.println("No-args constructor");
	}
	public void speak() {
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Mmmm");
			break;
		case "dog":
			System.out.println("Rrrr");
			break;
		case "bird":
			System.out.println("chika chika");
			break;
		case "goat":
			System.out.println("Booooo");
			break;
		case "sheep":
			System.out.println("Beee");
			break;
		case "rooster":
			System.out.println("Uru uuuu");
			break;
		default:
			System.out.println(".....");
		}
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
}}