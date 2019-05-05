package day36_Array_LIST_INTRO_wrappesClasses;
import java.util.*;
public class Array_LIST_exemple {
	public static void main(String[] args) {
//declare arraylist called languages
		ArrayList<String> lang = new ArrayList<>();
		lang.add("Java");
		lang.add("English");
		lang.add("Russian");
		lang.add("Kyrgyz");
		lang.add("Wrong English");
		lang.add("Manka");
		System.out.println("Number of values: " + lang.size()); //Number of values: 6
		
		lang.add("CHURKISH");
		System.out.println("Number of values: " + lang.size()); //Number of values: 7
		//remove
		lang.remove(6); //"CHURKISH"
		System.out.println("Number of values: " + lang.size()); //Number of values: 6
		
		System.out.println(lang.toString()); //[Java, English, Russian, Kyrgyz, Wrong English, Manka]
}}