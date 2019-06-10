package _TEMP;
import java.util.*;
public class TEMP_2 {
	
/***************************************************************************************************
Given:
public class Customer {
	ElectricAccount acct = new ElectricAccount();
	public void useelectricity(double kWh) {
	acct.addKWh(kWh);
	}
}
public class ElectricAccount {
	private double kWh;
	private double rate = 0.7;
	private double bill;
	//line n1
}
How should you write methods in the ElectricAccount class
at line n1 so that the member variable bill is always equal
to the value of the member variable kwh multiplied by
the member variable rate?
Any amount of electricity used by a customer (represented by
an instance of the customer class) must contribute to
the customer's bill (represented by the member variable
bill) through the method usedElectricity method. An instance of the customer class should
never be able to tamper with or
decrease the value of the member variable bill.

	A) public void addKWh(double kWh) {
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;
		}

	B) public void addKWh(double kWh) {
		if (kWh > 0){
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;
		}
	}

	C) private void addKWh(double kWh) {
		if (kWh > 0){
		this.kWh += kWh;
		this.bill = this.kWh * this.rate;
		}
	}

	D) public void addKWh(double kWh) {
		if (kWh > 0){
		this.kWh += kWh;
		setBill(this.kWh);
		}
	}

		public void setBill(double kWh) {
		bill = kWh * rate;
		}

				Choose options:
				A. Option A
				B. Option B
				C. Option C
				D. Option D

*****************************************************************************************************
	Given the code fragment:
	
		public static void main(String [] args){
			double discount = 0;
			int qty = Integer.parseInt(args[0]);
			//line n1;
		}
		
		And given the requirements:
If the value of the qty variable is greater than or equal	to 90, discount = 0.5
If the value of the qty variable is betweeen 80 and 90, discount = 0.2
 
		Which two code fragment can be independently placed at line n1 to meet the requirements?
		
		A. 		if (qty >= 90)
					{discount = 0.5;
					}
				if (qty > 80 && qty < 90) 
					{discount = 0.2; 
				}
		
		B. discount = (qty >= 90) ? 0.5 : 0;
		   discount = (qty > 80) ? 0.2 : 0;
		
		C. discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		
		D. 		if (qty > 80 && qty < 90) {
					discount = 0.2;
				}else {
					discount = 0;
				}if (qty >= 90){
					discount = 0.5;
				}else {
					discount = 0;
				}
				
		E. discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
****************************************************************************************************
		class Product {
			double price;
		}
		public class A1 {
		
		public void updatePrice(Product product, double price) {
			price = price * 2;
			product.price = product.price + price;
				//If we remove product. after = sign it will print 400.0 : 100.0
		}
		
		public static void main(String[] args) {
			Product prt = new Product();
			prt.price = 200;
			double newPrice = 100;
			
			A1 t = new A1();
			t.updatePrice(prt, newPrice);
			System.out.println(prt.price + " : " + newPrice);
			}
		}
		
			What is the result?
			A. 200.0 : 100.0
			B. 400.0 : 200.0
			C. 400.0 : 100.0
			D. Compilation fails.		


*/	
}