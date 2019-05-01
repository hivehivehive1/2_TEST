package day31_method_03;
import java.util.Arrays;
public class MethodsWithStrings {
	public static void main(String[] args) {
		
		countWords("Java is fun");
		countWords("this is method with strings");
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		String resultStr = "About 16,600,000 results (0.73 seconds)";
		googleSearchResults(resultStr);
	}
		public static void countWords(String sentence) {
			String[] str = sentence.split(" ");
			int count = 0;
		for(int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println("Words in this sentence: " + Arrays.toString(str));
		System.out.println("Number of words: " + count);
System.out.println("*********************************************************");
		}
		public static void googleSearchResults(String result) {
//split by space into array
			String[] g = result.split(" ");
	//	System.out.println(Arrays.toString(g));
		System.out.println("Result count: " + g[1].replace(",", ""));
		System.out.println("Time in sec: " + g[3].replace("(", ""));
		}
}