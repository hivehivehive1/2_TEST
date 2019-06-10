package day54_Inheritance_07_MUXA;
class Animals {

	public Animals() {
		System.out.println("Tiger");
	}
}
	public class constructor_super1 extends Animals {
	
	public constructor_super1() {
		super();
	}
	public constructor_super1(int a) {
		super();
	}
	public constructor_super1(double a) {
		super();
	}
	public static void main(String[] args) {
		new constructor_super1(10.5);
	}
}