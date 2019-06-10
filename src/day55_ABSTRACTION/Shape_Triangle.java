package day55_ABSTRACTION;
//5,Create Circle and Triangle Concrete class of Shape
public class Shape_Triangle extends Shape {
	double length1;
	double length2;
	double length3;
//5.1,create no arg constructor and call super class's 	one arg constructor
	public Shape_Triangle(String name) {
		super("Triangle");
	}
	public Shape_Triangle(double length1, double length2, double length3) {
		super("Triangle");
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}
//7,in Triangle class add leng1,leng2,leng3 and calculate your area according to the each side of triangle.	
//9, Implement the abstract methods in both class to provide detail
	@Override
	public double calculateArea() {
		double p = (length1 + length2 + length3) / 2;
		return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
	}
//9, Implement the abstract methods in both class to provide detail
	@Override
	public void draw() {
		System.out.println("    *\n" + 
						   "   ***\n" + 
						   "  *****\n" + 
						   " *******\n" + 
						   "*********");
	}
}