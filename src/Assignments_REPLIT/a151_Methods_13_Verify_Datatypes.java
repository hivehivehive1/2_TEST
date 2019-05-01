package Assignments_REPLIT;
import java.util.Scanner;
public class a151_Methods_13_Verify_Datatypes {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      String numStr = scan.next();
	      printDataTypes(numStr);
	    }
	    public static void printDataTypes(String numStr){
	      long num = 0;
	      try{
	         num = Long.valueOf(numStr);
	         System.out.println(num+" can be fitted in:");
	         		if(num >= -128 && num <= 127){
	              System.out.println("* byte");
	          }else if(num >= -32768 && num <= 32767) {
	        	  System.out.println("* byte");
	        	  System.out.println("* short");
	          }else if(num >= -2145483648 && num <= 2147483647) {
	        	  System.out.println("* byte");
	        	  System.out.println("* short");
	        	  System.out.println("* int");
	          }else if(num >= -9223372036854775808L && num <= 9223372036854775807L) {
	        	  System.out.println("* long");
	          }     
	      }catch(Exception e){
	         System.out.println(numStr+" can't be fitted anywhere.");
	      }
	    }
	  }