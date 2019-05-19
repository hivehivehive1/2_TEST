package day46_static_keyWord;
public class Ebuy_Customer {
	public static void main(String[] args) {
		Customer cm1 = new Customer("Adilet Orozbaev", "AdiletOrozbaev@gmail.com");
		Customer cm2 = new Customer("Urmat Atanbaev", "UrmatAtnabaev@yahoo.com");
		Customer cm3 = new Customer("ADILET KYRGYZ", "hive@usa.com");
		
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		Customer cm4 = new Customer("Nurbek Baibolov", "NBB@mail.ru");
		System.out.println("Total Customer: " + Customer.count);
		
		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		System.out.println(cm1);
		System.out.println(cm2);
}}