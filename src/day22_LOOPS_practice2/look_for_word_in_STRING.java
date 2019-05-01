package day22_LOOPS_practice2;
public class look_for_word_in_STRING {
	public static void main(String[] args) {
		String str = "He said hi, then she replied hi. hi guys!";
		//print in pairs, by 2 letters
		//check if temp equals "hi" ,if true, add 1 to count
		int count = 0;
		for(int i = 0; i < str.length() - 1; i++) {
			String temp = str.substring(i, i + 2); //2 letters
			//System.out.println(temp);
			if(temp.equals("hi")) {
				count++;
			}
		}
		//Count: 3
		System.out.println("Count: " + count);
		
		
		System.out.println();
		System.out.println(str.substring(8, 10) + str.substring(29, 31) + str.substring(33, 35));
}}