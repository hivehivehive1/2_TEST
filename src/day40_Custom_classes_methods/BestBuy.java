package day40_Custom_classes_methods;
public class BestBuy {
		public static void main(String[] args) {
			SmartPhone cell1 = new SmartPhone();
			cell1.brand = "Nokia 6300";
			cell1.screenSize = 2.0;
			cell1.color = "Silver";
			cell1.price = 76.16;
			System.out.println("Brand: " +      cell1.brand);
			System.out.println("ScreenSize: " + cell1.screenSize);
			System.out.println("Color: " +      cell1.color);
			System.out.println("Price: " +      cell1.price);

			cell1.color = "Black";
			System.out.println("Color: " +      cell1.color);
System.out.println("####### CELL 2 ######");			
			
			SmartPhone cell2 = new SmartPhone();
			cell2.brand = "Sumsung";
			cell2.screenSize = 1.1;
			cell2.color = "Blue";
			cell2.price = 39.32;
			System.out.println("Brand: " +      cell2.brand);
			System.out.println("ScreenSize: " + cell2.screenSize);
			System.out.println("Color: " +      cell2.color);
			System.out.println("Price: " +      cell2.price);
			
			System.out.println("##### CALLING METHODS ####");
			cell1.call();
			cell1.message();
			cell1.takeAPhoto();
			
			cell2.call();
			cell2.message();
			cell1.takeAPhoto();
}}