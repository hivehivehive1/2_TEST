package day09_StringEquals_Conditionals;
import java.util.*;
public class Citizens_NON_Citizens {

	public static void main(String[] args) {
	

				    int seniorCitizens, nonSeniorCitizens, age;
		    Scanner s = new Scanner(System.in);
		    
		    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		    
		    seniorCitizens = s.nextInt();
		    nonSeniorCitizens = s.nextInt();
		    
		    System.out.println("What is new citizen's age?");
		    age = s.nextInt();
		    if(age >= 65){
		        System.out.println("Senior Citizen");
		        seniorCitizens++; //++seniorCitizens;
		    }else{
		      System.out.println("Non-Senior Citizen");
		      nonSeniorCitizens++;
		    }
		    System.out.println("New seniorCitizens count "+seniorCitizens);
		    System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
		    
		  }}