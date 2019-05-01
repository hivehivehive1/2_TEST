package Assignments_REPLIT;
import java.util.*;
public class a153_Methods_15_Print_unique_words {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    String[] words = new String[size];
	    for(int i = 0; i < size; i++){
	      words[i] = scan.next();
	    }
	    printUniqueWords(words);
	  }
	  public static void printUniqueWords(String[] words){

	   String testWord;
	        int uniqueCount;
	        int cout = words.length;
	        for(int i = 0; i < cout; i++){
	            uniqueCount = 0;
	            testWord = words[i];

	            for(int j = 0; j < cout; j++){
	                if(testWord.equals(words[j])){
	                    uniqueCount++;
	                }
	            }
	            if(uniqueCount == 1){
	                System.out.println(testWord);
	            }
	        }
}}