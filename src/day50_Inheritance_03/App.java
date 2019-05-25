package day50_Inheritance_03;
public class App {
	
	private String name;
	public static int count;
	
	public App(String name) {
		this.name = name;
	}
	public static void build(String language) {// can't use name variable here, couz it is non static
		System.out.println("Build an app using " + language);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}