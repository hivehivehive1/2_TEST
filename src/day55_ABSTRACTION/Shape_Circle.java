package day55_ABSTRACTION;
//5,Create Circle and Triangle Concrete class of Shape
public class Shape_Circle  extends Shape {
//6,In Circle class add radius field.
		double radius;
//5.1,create no arg constructor and call super class's 	one arg constructor
	public Shape_Circle() {
		super("Circle");
	}
	public Shape_Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
//6, In Circle class add radius field. 
//      and use this field to calculate your area in your calculate are method
//9, Implement the abstract methods in both class to provide detail */	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
//9, Implement the abstract methods in both class to provide detail */
	@Override
	public void draw() {
		System.out.println( "  ***  \n" + 
							" *   * \n" + 
							"*     *\n" + 
							"*     *\n" + 
							"*     *\n" + 
							" *   * \n" + 
							"  ***");
	}
}