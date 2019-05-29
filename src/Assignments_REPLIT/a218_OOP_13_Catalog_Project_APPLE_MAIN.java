package Assignments_REPLIT;
public class a218_OOP_13_Catalog_Project_APPLE_MAIN {
	public static void main(String[] args) {
		
a218_OOP_13_Catalog_Project_APPLE ctl = new a218_OOP_13_Catalog_Project_APPLE();
		ctl.loadItems();
		ctl.loadPrices();
		ctl.loadMonthlyPayments();
		
		System.out.println(ctl.items.toString());
		System.out.println(ctl.prices.toString());
		System.out.println(ctl.monthlyPayments.toString());

a218_OOP_13_Catalog_Project_APPLE ctl2 = new a218_OOP_13_Catalog_Project_APPLE();
		ctl2.loadWholeCatalog();
		System.out.println(ctl2.getWholeCatalog().toString().trim());
		
  }
}