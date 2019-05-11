package day42_Custom_class_ENCAPSULATION;
public class Coffe_MAIN {
	public static void main(String[] args) {
//////////////////////////////////////////////		
		Coffe c1 = new Coffe();
		c1.name = "ICED CARAMEL MACCIATO";
		c1.size = "Grande";
		c1.price = 4.75;
		c1.calories = 250;
		c1.getCoffeInfo();
//////////////////////////////////////////////	
		Coffe c2 = new Coffe();
		c2.setName("JAVA JALAP");
		c2.size = "VENTI";
		c2.price = 5.95;
		c2.calories = 600;
		c2.getCoffeInfo();
//////////////////////////////////////////////
		Coffe c3 = new Coffe();
		c3.setName("ICED COFFEE");
		c3.setSize("TALL");
		c3.setPrice(2.45);
		c3.setCalories(60);
		c3.getCoffeInfo();
		System.out.println("coffe3 name: " +c3.name);
//////////////SHORT VERSION////////////////////		
		Coffe c4 = new Coffe();
		c4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		c4.getCoffeInfo();
}}