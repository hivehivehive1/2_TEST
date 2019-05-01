package day07_Scanner;

public class PREandPOST_CREMENTS {

	public static void main(String[] args) {
		int num = 10;
		int num2 = num++;
		
		System.out.println("num: "+ num); //11
		System.out.println("num2: " + num2); //10
		
		int n = 20;
		int n2 = ++n;
		System.out.println("n: "+ n); //21
		System.out.println("n2: " + n2); //21
		
		int i = 10;
		i++; //add 1
		++i; //add 1
		System.out.println("i value: " + i); //12
		
		int app = 5;
		int pea = ++app;
		System.out.println("app: "+app); //6
		System.out.println("pea: "+pea); //8
		
		int apples = 5;
		int pears = apples++;
		System.out.println("apples: "+apples);  //6
		System.out.println("pears: "+pears); //5
		
		int bananas = 6;
		int kiwi = bananas++;
		int cars = ++bananas;
		System.out.println("bananas: " + bananas); //8
		System.out.println("kiwi: " + kiwi);       //6
		System.out.println("cars: " + cars);       //8
		
		int friends = 10;
		int enemys = 10;
		System.out.println("friends: "+friends++); //10
		System.out.println("friends: "+friends);   //11
		System.out.println("enemys: "+ ++enemys);  //11
		
		int p1 = 10;
		int sum = p1++ + 5;
		System.out.println("sum: " + sum); //15 //p1 + 5 assign to sum
		System.out.println("p1: " + p1);   //11 // p = p + 1
		
		int batt = 8;
		int oldbatt = 5;
//		                  8    +     6
		int totalBatt = batt++ + ++oldbatt;
		System.out.println("batt: " + batt);           //9
		System.out.println("oldbatt: " + oldbatt);     //6
		System.out.println("totalBatt: " + totalBatt); //14
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
