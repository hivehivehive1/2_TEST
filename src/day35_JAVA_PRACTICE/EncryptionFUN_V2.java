package day35_JAVA_PRACTICE;
public class EncryptionFUN_V2 {
	public static void main(String[] args) {
		/* encryptChar
		 * return type: char
		 * param: char
		 * takes a char and returns encrupted version
		   ecryptChar('a') ==> z   */
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal: " + normal + "\n" + "encrypted: " + encrypted);
		
		System.out.println(encryptSentence("java is fun"));
		System.out.println(encryptSentence("i love java"));
	}

	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		// return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
		/* encryptedWord
		 * return type: String
		 * param: String
		 * take a string and returns escrypted version for the whole word
		 */
	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}
		/*
		 * encryptSentence
		 * return type: String
		 * param: String sentence
		 * Split the sentence by space and call encryptWord and 
		 * return encrypted sentence
		 * java is fun
		 */
	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.split(" ");
		String retValue = "";
		for (String word : wordsArr) {
			retValue += encryptWord(word) + " ";
		}
		return retValue.trim();
	}
}