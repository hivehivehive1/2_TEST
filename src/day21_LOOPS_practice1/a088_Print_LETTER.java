package day21_LOOPS_practice1;
import java.util.Scanner;
public class a088_Print_LETTER {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	//------------DO WHILE------------------------    
	    do{
	    System.out.print("" + start);
	    start++;
	    }while (start <= end);

	//------------WHILE---------------------------
	     while(start <= end){
	       System.out.print("" + start);
	       start++;
	     }
	     for(int i = start; i <= end; i++){
	       System.out.print("" + start);
	     }
	//-------------az-----------------------------
	    // String letter = "az";
	    // char a = letter.charAt(0);
	    // char z = letter.charAt(1);
	    
	    // int b = letter.charAt(0);
	    // int c = letter.charAt(1)
	    // System.out.print("a - " + b + "\nz - " + c); 
}}