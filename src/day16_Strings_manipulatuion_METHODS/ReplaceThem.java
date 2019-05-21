package day16_Strings_manipulatuion_METHODS;
public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		//replace, with!!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "@#$%^ja-vla#$^%";
		mixed = mixed.replace("@#$%^", "").replace("#$^%", "").replace("-", "").replace("l", "");
		System.out.println(mixed); //java
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed); //jv
		
		String result = "About 115,000,000 result (0.59 second)";
		//using replace, get number of result
		result = result.replace("About ", "").replace(" result (0.59 second)", "");
		System.out.println(result);
		
		String result2 = "About 115,000,000 results (0.11 seconds)";
		//using string methods(replace, substring) get number of results
		//115,000,000	
		result2 = result2.replace("About ", "");//115,000,000 results (0.11 seconds)
		//result = result.replace(" results (0.66 seconds)", ""); might break when number changes
		result2 = result2.substring(0, result2.indexOf(" "));
		System.out.println(result2);
		
		result2 = result2.replaceFirst(",", ""); //115000,000
		System.out.println(result2);
}}