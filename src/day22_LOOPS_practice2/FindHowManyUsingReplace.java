package day22_LOOPS_practice2;
public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String word = "including webpages, images";
		//find how many "E" chars in the word
		//get the length of word
		//replace all "E" with empty
		//get the length of word without "E"
		//do a minus
		
		int length1 = word.length();
		word = word.replace("e", "");
		int length2 = word.length();
		
		System.out.println("Length1: " + length1);
		System.out.println("Length2: " + length2);
		
		int count = length1 - length2;
		System.out.println("Count of E: " + count);
	}

}
