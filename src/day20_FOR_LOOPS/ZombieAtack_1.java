package day20_FOR_LOOPS;
import java.util.Scanner;
public class ZombieAtack_1 {
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    //int inhabitants = 250_500_000;
	      int inhabitants = scan.nextInt();
	      int day = 0;
	      while(inhabitants > 0) {
	        System.out.println("Day " + day + " [" + inhabitants + "]");
	        day++; //add 1 to day
	        inhabitants = inhabitants / 2; //decrease by half
	        }
	        System.out.println("---- EXTINCT ----");
	        
}}
