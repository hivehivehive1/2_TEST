package day11_LOGICAL_Nestedif;
import java.util.Scanner;
public class Toll_Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Vehicle Type: "); //1,2
		int carType = scan.nextInt();
		System.out.println("Is it rush hour: yes | no");
		String RushHour = scan.next(); //yes or no
		
		//check if rushHour is "yes" assign true to isRushHour if it is "no",
		//        assign false to isRushHour
		
		boolean isRushHour;
		if(RushHour.equalsIgnoreCase("yes")) {
			isRushHour = true;
		}else {
			isRushHour = false;
		}
		System.out.println(isRushHour);
		double price = 0.0;
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0; //A
			} else {
				price = 5.0; //B
			}
		}else if(carType == 2) {
			if(isRushHour) {
				price = 55.30; //C
			}else {
				price = 15.99; //D
				
			}
			
		}
		System.out.println("Toll coast: " + price);
}}