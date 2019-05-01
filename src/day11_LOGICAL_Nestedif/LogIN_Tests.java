package day11_LOGICAL_Nestedif;
import java.util.Scanner;
public class LogIN_Tests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username, password;
		
		System.out.print("Enter username: ");
		username = scan.next();
		System.out.print("Enter password: ");
		password = scan.next();
		
		String validUserName = "cyber@KOTOK.in";
		String validPassWord = "KOTOK666";
		
				  if(username.equalsIgnoreCase(validUserName) && password.equals(validPassWord)) {
				System.out.println("\n Login Successful, Welcome!");
			}else if(!username.equalsIgnoreCase(validUserName) && !password.equals(validPassWord)) {
				System.out.println("\n Invalid Username and Invalid Password");
			}else if(username.equalsIgnoreCase(validUserName) && !password.equals(validPassWord)) {
				System.out.println("\n Valid Password");
			}else if(!username.equalsIgnoreCase(validPassWord) && password.equals(validPassWord)) {
				System.out.println("\n Invalid Username");
			}	 
}}