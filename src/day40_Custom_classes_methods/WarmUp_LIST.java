package day40_Custom_classes_methods;
import java.util.*;
public class WarmUp_LIST {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("RR");
		myList.add("100.000.000$");
		myList.add("MIAMI CASTLE");
		myList.add("NY PH");
		myList.add("BISHKEK BANK");
		myList.add("JAPAN PH");
		myList.add("CANADA PH");
		myList.add("DC PH");
		myList.add("LA PH");
		myList.add("BISHKEK PH");
		
		String targetWord = "BISHKEK PH";
		int count = countOccurances(myList, targetWord);
		if(count == 3) {
			System.out.println("Unit test PASS: Count is 3.");
		}else {
			System.out.println("Unit test FAIL: Count is " + count);
			System.out.println("Expected: 3");
			System.out.println("Actual: " + count);
		}
	}								//[aa, aa, bb, jj, yy]            aa
	public static int countOccurances(ArrayList<String> list, String word) {
		int count = 0;
		for(String str : list) {
			if(str.equals(word)) {
				count++;
			}
		}
		return count;
}}