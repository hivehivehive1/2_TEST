package day52_Inheritance_05_FINAL;
import java.util.*;
public class FINAL_LIST {
	
	final static public String COLOR = "RED";
		
		 //public -> access modifier
		 //final, static -> non-access modifier
		public static void main(String[] args) {
			final ArrayList<String> COLORS = new ArrayList<>();
			COLORS.add("Orange");
			COLORS.add("Grey");
			COLORS.add("White");
			COLORS.add("Blue");
			
			System.out.println(COLORS.toString());
			COLORS.add("Black");
			System.out.println(COLORS.toString());
			
//			COLORS = new ArrayList<>();//new Object
//			System.out.println(COLORS.toString());
//			COLORS.add("Yellow");
}}