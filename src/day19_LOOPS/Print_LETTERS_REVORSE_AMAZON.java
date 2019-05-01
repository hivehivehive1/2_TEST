package day19_LOOPS;
public class Print_LETTERS_REVORSE_AMAZON {
	public static void main(String[] args) {
		String word = "Amazon ";
		//print each char one by one in seperate lines
		int abc = 0;

		while(abc < word.length()) {
		System.out.println(word.charAt(abc));
		abc++;
		}
		
		String word2 = " Amazon";
		int abc2 = word2.length() - 1;

		while(abc2 >= 0) {
		System.out.println(word2.charAt(abc2));
		abc2--;
		}

}}
