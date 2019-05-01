package day26_Array_in_Java;
public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length); //Count: 4
		System.out.println(wordsArray[3]); //selenium
	//	System.out.println(Arrays.toString(wordsArray));
System.out.println("============================================================");
		for(String word : wordsArray) {
			System.out.println(word); 
		}
System.out.println("============================================================");
//using split method, print 1,461		
		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println("Search result total: " + diceArray[4]); //Search result total: 1,461
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
System.out.println("============================================ALL_Words_Split=");
String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		for(String w : allWords) {
			System.out.println(w);
		}
System.out.println("================================================Happy_Split=");
		String[] happySplit = sentence.split("happy");
		for(String w : happySplit) {
			System.out.println(w);
		}
System.out.println("====================================================I_Split=");
		String[] ISplit = sentence.split("I");
		for(String w : ISplit) {
			System.out.println(w);
		}
System.out.println("====================================================j_a_v_a=");
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch : charsArray) {
			System.out.println(ch);
		}
}}