package day16_Strings_manipulatuion_METHODS;
public class GetNumberFromString {
	public static void main(String[] args) {
		    //print number between [and]
		String sentence = "I wrote [1111] lines of code today";
		int start = sentence.indexOf('[') + 1;
		int end = sentence.indexOf(']');
		String codeCount = sentence.substring(start, end);
		System.out.println("Lines of code: " + codeCount);
		
		//System.out.println("Lines of code: " + sentence.substring(sentence.IndexOf('[') + 1, sentence.IndexOf(']'));
		
		//Check if codeCount is more than 20
		int count = Integer.parseInt(codeCount);
		if(count > 20) {
			System.out.println("Wrote more than 20 lines of code Today!");
		}else {
			System.out.println("Not enough coding for today");
		}
		
}}
