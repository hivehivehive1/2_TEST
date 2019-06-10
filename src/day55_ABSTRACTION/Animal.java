package day55_ABSTRACTION;
public abstract class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
//we cannot have astract methods in regular class	
	public abstract void speak();
	public abstract void eat();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}