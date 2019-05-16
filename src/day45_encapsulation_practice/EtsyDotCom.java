package day45_encapsulation_practice;
public class EtsyDotCom {
	public static void main(String[] args) {
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
System.out.println("\n================================ valid ===================================");
		acct1.setEmail("hive@usa.com");
		acct1.setFirstName("hive");
		acct1.setPassword("password123");
		System.out.println(acct1.toString());
System.out.println("\n=================================invalid email============================");		
		EtsyAccount acct2 = new EtsyAccount();
		acct2.setEmail("hiveusa.com");
		acct2.setFirstName("hive123");
		acct2.setPassword("pa123");
		System.out.println(acct2.toString());
System.out.println("\n=============================invalid FirstName===========================");
		EtsyAccount acct3 = new EtsyAccount("asdasdasd@asdasd.asd" , "1asd", "password123");
		System.out.println(acct3.toString());
System.out.println("\n========================== Random password ===============================");
		EtsyAccount acct4 = new EtsyAccount("hive@usa.com" , "hive");
		System.out.println(acct4.toString());
}}