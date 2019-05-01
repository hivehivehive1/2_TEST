package day12_SWITCH_ternary;
import java.util.Scanner;
public class Tip_Calculator {
	  public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   double bill = 0.0;
		   double person = 0.0;
		   double tip = 0.0;
		   double totalPay, tipP;
		   int numOfPeople;
		   String sQ;
		   System.out.println("Split:");
		   String split = scan.next();
		   if(split.equalsIgnoreCase("yes")) {
		   }
//------------------------------------------------------			   
		    System.out.println("Number of people:");
		    numOfPeople = scan.nextInt();
//------------------------------------------------------			     
		    System.out.println("Check amount:");
		    bill = scan.nextDouble();
//------------------------------------------------------			    
		    System.out.println("Service Quality:");
		    sQ = scan.next();
		          if(sQ.equalsIgnoreCase("poor")) {
		      tip = (bill * 0.05);
		    }else if(sQ.equalsIgnoreCase("fair")) {
		      tip = (bill * 0.10);
		    }else if(sQ.equalsIgnoreCase("good")) {
		      tip = (bill * 0.15);
		    }else if(sQ.equalsIgnoreCase("great")) {
		      tip = (bill * 0.20);
		    }else if(sQ.equalsIgnoreCase("excellent")) {
		      tip = (bill * 0.25);
		    }
//------------------------------------------------------		    
		    String numOfPeople1;
		    numOfPeople1 = Integer.toString(numOfPeople);
		    switch(numOfPeople) {
		    case 1:
		    numOfPeople1 = "&";
		    break;
		    case 2:
		    numOfPeople1 = "&&";
		    break;
		    case 3:
		    numOfPeople1 = "&&&";
		    break;
		    case 4:
		    numOfPeople1 = "&&&&";
		    break;
		    case 5:
		    numOfPeople1 = "&&&&&";
		    break;
		    case 6:
		    numOfPeople1 = "&&&&&&";
		    break;
		    case 7:
		    numOfPeople1 = "&&&&&&&";
		    break;
		    case 8:
		    numOfPeople1 = "&&&&&&&&";
		    break;
		    case 9:
		    numOfPeople1 = "&&&&&&&&&";
		    break;
		    case 10:
		    numOfPeople1 = "&&&&&&&&&&&";
		    break;
		    default:
		    return;
		    }
//------------------------------------------------------		    
			System.out.println("Number of people entered: " + numOfPeople1);
			totalPay = bill + tip;
		    System.out.println("Total to pay: " + totalPay);   
//------------------------------------------------------			    
		    System.out.println("Total tip: " + tip);
		    person = totalPay / numOfPeople;
//------------------------------------------------------			    
		    System.out.println("Total per person: " + person);
		    tipP = tip / numOfPeople;
		    System.out.println("Tip per person: " + tipP);  
}}