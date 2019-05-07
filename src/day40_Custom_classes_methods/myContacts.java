package day40_Custom_classes_methods;
public class myContacts {
	public static void main(String[] args) {
		//create Contact object
		Contact Chack = new Contact();
		Chack.name = "Chack Noris";
		Chack.phoneNumber = "(911) 911-6666";
		Chack.email = "ChackNoris@pizdec.org";
		
		Chack.call();
		Chack.sendMessage();
		Chack.sendEmail();
		
		Contact Putin = new Contact();
		Putin.name = "BB Putin";
		Putin.phoneNumber = "7(777) 777 7777";
		Putin.email = "Putin@BEST.ru";
		System.out.println("Name: " + Putin.name);
		System.out.println("PhoneNumber: " + Putin.phoneNumber);
		System.out.println("Email: " + Putin.email);
		
		Putin.call();
		Putin.sendMessage();
		Putin.sendEmail();
		
		
		
		
		
		
		
		
}}