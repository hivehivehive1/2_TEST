package day42_Custom_class_ENCAPSULATION;
import java.util.*;
public class StringShoesToString {
	public static void main(String[] args) {
		String data = "KERZO, 9.5";
		//split using "," and store into array
		String[] arrData = data.split(",");
		//Create Shoes object
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getShoesData());
System.out.println("================================");
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		//create object using data from scanner
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
}}