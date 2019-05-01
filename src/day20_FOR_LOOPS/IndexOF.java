package day20_FOR_LOOPS;
public class IndexOF {
	public static void main(String[] args) {
		String word = "Amazon";
	//	word.toLowerCase();
		char letter = 'a';
		int index = -1;
		//using FOR LOOP - look for the letter
		//if it is a match assign value to index
		//exit for loop
		//print value of index
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				index = i;
				break;
			}	
		}
		System.out.println("Index: " + index); //3


}}
