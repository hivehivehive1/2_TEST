package MyRoof_05_21;
public class EmailGenerator_MAIN {
	public static void main(String[] args) {
		
		EmailGenerator.companyName = "Google";
		EmailGenerator e1 = new EmailGenerator("Urma");
		System.out.println(e1.getEmail());
		
		EmailGenerator e2 = new EmailGenerator("Adik");
		System.out.println(e2.getEmail());
		
		
//both object will have different company name in the email, bcos value of the static variable
		//applies to all object
		EmailGenerator.companyName = "Apple";
		System.out.println(e1.getEmail());
		System.out.println(e2.getEmail());
		
		e1.name = "hive";
		System.out.println(e1.getEmail());
		System.out.println(e2.getEmail());
}}