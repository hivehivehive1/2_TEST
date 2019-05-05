package Vasia_may_02;
import java.util.Arrays;
public class CharPractice {
	public static void main(String[] args) {
		String phoneNumber = "(240) 111 2222";
//toCharArray() - it will convert any string into array of chars
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		int digitCounter = 0;
//isDigit() method returns true, if given char is digit
		for(char value : chars) {
			if(Character.isDigit(value)) {
				digitCounter++;
			}
		}
		System.out.println("Number of digits: " + digitCounter);
		String name = "Mike";
//Character.isAlphabetic(codePoint) > to verify if name in valid
		boolean isValid = false;
//we can use FOR EACH loop only with collections of data
//since name is a String, we need to use method .toCharArray() that will convert
//String into array of char		
//		for(char var : name.toCharArray()) {
//		}
		
        for (int i = 0; i < name.length(); i++) {
            char var = name.charAt(i);
            isValid = Character.isAlphabetic(var);
            
            if(isValid == true) {
                System.out.println(var + " : letter");
            }else {
                System.out.println(var + " : not letter");
            }
        }
    }
}
