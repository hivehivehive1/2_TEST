package day21_LOOPS_practice1;
public class ConvertCHARtoSTRING {
	public static void main(String[] args) {
		
		//Convert char to String
		char ch = 'a';
		String str1 = "" + ch;
		System.out.println(str1); //1
		
		char ch2 = 'v';
		String str2 = new String("" + ch2);
		String str3 = Character.toString(ch2);
		System.out.println(str2); //v
		System.out.println(str3); //v
	}

}
