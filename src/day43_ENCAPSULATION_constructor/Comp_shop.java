package day43_ENCAPSULATION_constructor;
public class Comp_shop {
	public static void main(String[] args) {
		Comp comp1 = new Comp();
		Comp comp2 = new Comp();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
//Comp [Brand = unknown, OS = unknown, Price = 0.0]
//Comp [Brand = unknown, OS = unknown, Price = 0.0]
		
		comp1.setBrand("iMac");
		comp1.setOs("macOS High Sierra");
		comp1.setPrice(2500);
		System.out.println(comp1.toString());
//Comp [Brand = iMac, OS = macOS High Sierra, Price = 2500.0]
		
		comp2.setBrand("Acer");
		comp2.setOs("Aspire 700");
		comp2.setPrice(949);
		System.out.println(comp2.toString());
//Comp [Brand = Acer, OS = Aspire 700, Price = 949.0]
		
		Comp comp3 = new Comp("ASUS", "Windows 10", 645.5);
		System.out.println(comp3.toString());
//Comp [Brand = ASUS, OS = Windows 10, Price = 645.5]
		
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
//Comp [Brand = ASUS, OS = Windows 11, Price = 645.5]
		
		comp3.setPrice(comp3.getPrice() - 500);
		System.out.println(comp3.toString());
//Comp [Brand = ASUS, OS = Windows 11, Price = 145.5]		
}}