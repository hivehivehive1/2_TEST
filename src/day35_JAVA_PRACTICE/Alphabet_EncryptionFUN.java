package day35_JAVA_PRACTICE;
public class Alphabet_EncryptionFUN {
	public static void main(String[] args) {
						  //0123456789
		String alphabet  = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
					//"vzhgvi";
		String word = "easter";
	//get a char from word
	//find indexOf the char in alphabet
	//read the char from encrypted at that index
	//add to some String
//		char first = word.charAt(0);
//		int position = alphabet.indexOf(first);
//		System.out.println("Position: " + position);
//		char enChar = encrypted.charAt(position);
//		System.out.println(first + " --> " + enChar);

	//with a loop
		String encryptedWord = "";
		for(int i = 0; i< word.length(); i++) {
			char ch = word.charAt(i);

			//find in aplphabet
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index) + "+");
			encryptedWord += encrypted.charAt(index);//v
			System.out.print(index + " - ");
		}System.out.println();
		System.out.println(word);
		System.out.println(encryptedWord);
}}