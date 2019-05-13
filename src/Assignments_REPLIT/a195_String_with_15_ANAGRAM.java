package Assignments_REPLIT;
import java.util.*;
public class a195_String_with_15_ANAGRAM {
	public static void main(String[] args) {
		String word1 = "listen";
		String word2 = "Silent";
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		    String s1 = "";
		    String s2 = "";
		    for(int i = 0; i < word1.length(); i++) {
		    	s1 += word1.charAt(i) + ",";
		    }
		    for(int i = 0; i < word2.length(); i++) {
		    	s2 += word2.charAt(i) + ",";
		    }
		    String[] a1 = s1.split(",");
		    String[] a2 = s2.split(",");
		    
		    Arrays.sort(a1);
		    Arrays.sort(a2);
		    
		    System.out.println(Arrays.toString(a1));
		    System.out.println(Arrays.toString(a2));
}}