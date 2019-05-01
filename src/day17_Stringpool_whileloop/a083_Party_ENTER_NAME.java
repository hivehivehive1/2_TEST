package day17_Stringpool_whileloop;
import java.util.Scanner;
public class a083_Party_ENTER_NAME {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    String name = "";
	    System.out.println("Please enter guest name:");
	    name += scan.nextLine();
	    System.out.println("Do you want to enter new guest name:");
	    String newGuest = scan.next();

	    while (newGuest.equalsIgnoreCase("yes")){
	      System.out.println("Please enter guest name:");
	      name += ", " + scan.next();
	      System.out.println("Do you want to enter new guest name:");
	    newGuest = scan.next();
	    }
	    System.out.println("Guest's list: " + name);
}}
// System.out.println("Please enter guest name:");
// String name = input.next();
// System.out.println("Do you want to enter new guest name:");
// String answer = input.next();

// while (answer.equals("yes")) {
//   System.out.println("Please enter guest name:");
// String name1 = input.next();
// name = name+", "+name1;
// System.out.println("Do you want to enter new guest name:");
// answer = input.next();
// }
// System.out.println("Guest's list: "+name);
