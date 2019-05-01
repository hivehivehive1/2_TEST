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
		System.out.println("Number of values: " + lang.size());
		lang.add("CHURKISH");
		
		System.out.println("Number of values: " + lang.size());
		//remove
		lang.remove(6);
		System.out.println("Number of values: " + lang.size());
		
		System.out.println(lang.toString());

}}
