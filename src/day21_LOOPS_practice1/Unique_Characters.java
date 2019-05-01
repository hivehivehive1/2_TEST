package day21_LOOPS_practice1;
public class Unique_Characters {
	public static void main(String[] args) {
		String word = "Javva";
		String uniq = "";
		
		char ch = word.charAt(0);
		System.out.println(uniq.contains("" + ch));
		if(!uniq.contains("" + ch)) {
		  uniq += ch; //unique = unique + ch;
		}
//		if(uniq.indexOf(ch == -1)) {
			uniq += ch;
		}
//		System.out.println("Unique: " + uniq);
//==============================================================
		String word2 = "Bananas";
		String uniq2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
//		System.out.println("Ch2: " + ch2);
		
//		i = 1;
//		ch2 = word2.charAt(i);
		
}
