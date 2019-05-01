package day22_LOOPS_practice2;
public class SubString_java_ja {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0, 2)); //ja
		//print each char in separate line using substring, no loop needed
		System.out.println(word.substring(0, 1)); //j
		System.out.println(word.substring(1, 2)); //a
//		System.out.println(word.substring(7, 9)); //ERROR
//--------------------------------------------------------------------		
		System.out.println("###############################");
		
		int i = 0;						//0, 1
		System.out.println(word.substring(i, i + 1)); //j
		i++;							//1, 2
		System.out.println(word.substring(i, i + 1)); //a
		i++;							//2, 3
		System.out.println(word.substring(i, i + 1)); //v
		i++;							//3, 4
		System.out.println(word.substring(i, i + 1)); //a
//--------------------------------------------------------------------
		System.out.println("            FOR LOOP           ");
		
		for(int n = 0; n <= 3; n++) {
//same			System.out.println(word.substring(n, n + 1));
			String letter = word.substring(n, n + 1);
			System.out.println(letter);
		}
//--------------------------------------------------------------------		
			System.out.println("            REVERSE           ");
			
			for(int n = 3; n >= 0; n--) {
				String letter = word.substring(n, n + 1);
				System.out.println(letter);
			}
//--------------------------------------------------------------------
			System.out.println("           UnitedStates           ");
			int start = 6;
			int end = 12;  //0123456789	
			String word2 = "UnitedStates";
			System.out.println(word2.substring(start, end)); //States
			System.out.println(word2.substring(6, 12));      //States
			System.out.println(word2.substring(6));			 //States	
			System.out.println(word2.substring(6, 7));       //S
			System.out.println(word2.substring(word2.length() - 1)); //s
}}