package day10_logical_Operators_conditioals;
import java.util.Scanner;
public class Real_Estate_Calculator {
	
	public static void main(String[] args) {
		
			    int propertyPrice = 0; 
				int numberOfBedrooms, garageSpots;
				float metroAccessibility, schoolScore, highwayAccessibility;
				boolean backyard, smoking, garage;
				String houseType;
				
				Scanner scan = new Scanner(System.in);
				System.out.println("*****************************************");
				System.out.println("* Welcome to the RealEstate calculator! *");
				System.out.println("*****************************************");
		
		  System.out.println("Enter your property type:");
		    houseType = scan.nextLine();	
		    		    	
		    if (houseType.equalsIgnoreCase("Condo")) {
		    	propertyPrice = 50000;
		    	System.out.println("How many bedrooms do you have?");
			    numberOfBedrooms = scan.nextInt();	// add 30 000 for every bedroom
			    propertyPrice = propertyPrice + (numberOfBedrooms*30000);
//		====================	
			    System.out.println("Do you have a backyard?");
			    backyard = scan.nextBoolean();
			    System.out.println("Backyard is not available for condo!");
			    
//			    System.out.println("Do you have a backyard?");
//			    backyard = scan.nextBoolean();
//			    System.out.println("Backyard is not available for condo!");
//		=========================	
			    System.out.println("Do you have garage?");
			    garage = scan.nextBoolean();
			    if (garage) {
			        System.out.println("How many spots?");
			    	garageSpots = scan.nextInt();	// if garage =true add 20 000 for every spot
			    	if (garageSpots >10) {
			    		System.out.println("Pardon, it's not a public parking!");
		//	    	  propertyPrice = propertyPrice;
			    	} else {
			    	  propertyPrice = propertyPrice + (garageSpots*20000);
			    	}
			    }
//		=======================	
			    System.out.println("How close is metro station?");
			    metroAccessibility = scan.nextFloat();
			    // If metro is closer than 1 mile (inclusive), 
			    //add to the property price 10000. 
			    //If metro is in the radius from 1 mile to 3 miles,  
			    //add to the property price 5000
			    if (metroAccessibility <=1.0) {
			    	propertyPrice = propertyPrice + 10000;
			    } else if (metroAccessibility >1.0 && metroAccessibility<=3.0) {
			    	propertyPrice = propertyPrice + 5000;
			    }
//		========================	 
			    System.out.println("How close is highway?");
			    highwayAccessibility = scan.nextFloat();
			    if (highwayAccessibility <=1.0) {
			    	propertyPrice = propertyPrice + 15000;
			    } else if (highwayAccessibility >1.0 && highwayAccessibility<=5.0) {
			    	propertyPrice = propertyPrice + 8000;
			    } else if (highwayAccessibility >5.0 && highwayAccessibility<=20.0) {
			    	propertyPrice = propertyPrice + 4000;
			    }
//		=======================	   
			    System.out.println("What's the rating of nearest school?");
			    schoolScore = scan.nextFloat();
			    //from 10 (inclusive) to 8 points,  add to the property price 45000
			    // less than 8 points and more or equals to 4 points,  add to the property price 20000
			    //Otherwise, add 5000 to the property price
			    if (schoolScore <=10.0 && schoolScore >=8.0) {
			    	propertyPrice = propertyPrice + 45000;
			    } else if (schoolScore<8.0 && schoolScore>=4.0) {
			    	propertyPrice = propertyPrice + 20000;
			    } else if (schoolScore<4.0){
			    	propertyPrice = propertyPrice + 5000;
			    }
//		=========================	
			    System.out.println("Does any of your family members smoking?");
			    smoking = scan.nextBoolean();
			    // true -reduce property price for 5000
			    if (smoking) {
			    	propertyPrice = propertyPrice - 5000;
			    } else {
			    	propertyPrice = propertyPrice;
			    }
			    System.out.println("Market report has been generated.");
			    System.out.println("Your estimate market price is: " + propertyPrice + "$");
			    }
//	-----------------------------------------------------------------------------------------------------	    
		   else if (houseType.equalsIgnoreCase("Townhouse")) {
		    	propertyPrice = 75000;
		    	System.out.println("How many bedrooms do you have?");
			    numberOfBedrooms = scan.nextInt();	// add 30 000 for every bedroom
			    propertyPrice = propertyPrice + (numberOfBedrooms*30000);
			    System.out.println("Do you have a backyard?");
			    backyard = scan.nextBoolean();	// add 5000 if it's true
			    if (backyard) {
			    	propertyPrice = propertyPrice + 5000;
			    } else {
			    	propertyPrice = propertyPrice;
			    }
//		======================	
			    System.out.println("Do you have garage?");
			    garage = scan.nextBoolean();
			    if (garage) {
			    	System.out.println("How many spots?");
			    	garageSpots = scan.nextInt();	// if garage =true add 20 000 for every spot
			    	if (garageSpots >10) {
			    		System.out.println("Pardon, it's not a public parking!");
			    	  propertyPrice = propertyPrice;
			    	} else {
			    	  propertyPrice = propertyPrice + (garageSpots*20000);
			    	}
			    }
//		=====================
			    System.out.println("How close is metro station?");
			    metroAccessibility = scan.nextFloat();
			    // If metro is closer than 1 mile (inclusive), 
			    //add to the property price 10000. 
			    //If metro is in the radius from 1 mile to 3 miles,  
			    //add to the property price 5000
			    if (metroAccessibility <=1) {
			    	propertyPrice = propertyPrice + 10000;
			    } else if (metroAccessibility >1 && metroAccessibility<=3) {
			    	propertyPrice = propertyPrice + 5000;
			    }
//		======================	
			    System.out.println("How close is highway?");
			    highwayAccessibility = scan.nextFloat();
			    if (highwayAccessibility <=1.0) {
			    	propertyPrice = propertyPrice + 15000;
			    } else if (highwayAccessibility >1.0 && highwayAccessibility<=5.0) {
			    	propertyPrice = propertyPrice + 8000;
			    } else if (highwayAccessibility >5.0 && highwayAccessibility<=20.0) {
			    	propertyPrice = propertyPrice + 4000;
			    }
//		========================
			    System.out.println("What's the rating of nearest school?");
			    schoolScore = scan.nextFloat();
			    //from 10 (inclusive) to 8 points,  add to the property price 45000
			    // less than 8 points and more or equals to 4 points,  add to the property price 20000
			    //Otherwise, add 5000 to the property price
			    if (schoolScore <=10.0 && schoolScore >8.0) {
			    	propertyPrice = propertyPrice + 45000;
			    } else if (schoolScore<8.0 && schoolScore>=4.0) {
			    	propertyPrice = propertyPrice + 20000;
			    } else if (schoolScore<4.0){
			    	propertyPrice = propertyPrice + 5000;
			    }
//		=========================	
			    System.out.println("Does any of your family members smoking?");
			    smoking = scan.nextBoolean();
			    if (smoking) {
			    	propertyPrice = propertyPrice - 5000;
			    } else {
			    	propertyPrice = propertyPrice;
			    }
			    System.out.println("Market report has been generated.");
			    System.out.println("Your estimate market price is: " + propertyPrice + "$");
			    }
//	-----------------------------------------------------------------------------------------------------	    
		   else if (houseType.equalsIgnoreCase("Single Family Home")) {
		    	propertyPrice = 95000;
//		=================
		            System.out.println("How many bedrooms do you have?");
			    numberOfBedrooms = scan.nextInt();	// add 30 000 for every bedroom
			    propertyPrice = propertyPrice + (numberOfBedrooms*30000);
			    System.out.println("Do you have a backyard?");
			    backyard = scan.nextBoolean();	// add 5000 if it's true
			    if (backyard) {
			    	propertyPrice = propertyPrice + 5000;
			    } else {
			    	propertyPrice = propertyPrice;
			    }
//		================
			    System.out.println("Do you have garage?");
			    garage = scan.nextBoolean();
			    if (garage) {
			    	System.out.println("How many spots?");
			    	garageSpots = scan.nextInt();	// if garage =true add 20 000 for every spot
			    	if (garageSpots >10) {
			    		System.out.println("Pardon, it's not a public parking!");
			    	  propertyPrice = propertyPrice;
			    	} else {
			    	  propertyPrice = propertyPrice + (garageSpots*20000);
			    	}
			    }
//		=================
			    System.out.println("How close is metro station?");
			    metroAccessibility = scan.nextFloat();
			    if (metroAccessibility <=1) {
			    	propertyPrice = propertyPrice + 10000;
			    } else if (metroAccessibility >1 && metroAccessibility<=3) {
			    	propertyPrice = propertyPrice + 5000;
			    }
//		==================
			    System.out.println("How close is highway?");
			    highwayAccessibility = scan.nextFloat();
			    if (highwayAccessibility <=1) {
			    	propertyPrice = propertyPrice + 15000;
			    } else if (highwayAccessibility >1 && highwayAccessibility<=5) {
			    	propertyPrice = propertyPrice + 8000;
			    } else if (highwayAccessibility >5 && highwayAccessibility<=20) {
			    	propertyPrice = propertyPrice + 4000;
			    }
//		=================
			    System.out.println("What's the rating of nearest school?");
			    schoolScore = scan.nextFloat();
			    if (schoolScore <=10 && schoolScore >8) {
			    	propertyPrice = propertyPrice + 45000;
			    } else if (schoolScore<8 && schoolScore>=4) {
			    	propertyPrice = propertyPrice + 20000;
			    } else if (schoolScore<4){
			    	propertyPrice = propertyPrice + 5000;
			    }
//		==================
			    System.out.println("Does any of your family members smoking?");
			    smoking = scan.nextBoolean();
			    if (smoking) {
			    	propertyPrice = propertyPrice - 5000;
			    } else {
			    	propertyPrice = propertyPrice;
			    }
			    System.out.println("Market report has been generated.");
			    System.out.println("Your estimate market price is: " + propertyPrice + "$");

}}}
