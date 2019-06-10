package day56_ABSTRACTION_02;
public abstract class Browser {
	
	String name;
	static int id;
	//abstract double price;
	
	public Browser() {
		System.out.println("Creating a Browser");
	}
	public Browser(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public abstract void navigator(String url);
	public abstract void displayWebpage();
	public abstract boolean launch();
	
	public void close() {
		System.out.println("Exitting the Browser");
	}
}