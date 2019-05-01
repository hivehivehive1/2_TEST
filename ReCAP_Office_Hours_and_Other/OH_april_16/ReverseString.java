package OH_april_16;
public class ReverseString {
	public static void main(String[] args) {
		String today = "Tuesday";
//Print Tues , day		
		String t = today.substring(0, 4);
		System.out.println(t);
		String d = today.substring(4);
		System.out.println(d);
		System.out.println(t + "\n" + d); //Tues , day
		System.out.println(today.substring(2, 3)); //e
		System.out.println(today.charAt(2));       //e
		int i = 2;
		System.out.println(today.charAt(i));       //e
System.out.println();
		for(i = 0; i < today.length(); i++) {
		//	System.out.println(today.charAt(i)); 		   //T u e s d a y
		//	System.out.println(today.substring(i, i + 1)); //T u e s d a y
			System.out.println(today.substring(i));
		}	/*
				Tuesday
				uesday
				esday
				sday
				day
				ay
				y
			*/
		for(int j = today.length() - 1; j >= 0; j--) {
			System.out.print(today.charAt(j) + " "); 		   //y a d s e u T 
		}
System.out.println();
		for(int m = today.length() - 1; m >= 0; m--) {
			System.out.print(today.substring(m, m + 1) + " "); //y a d s e u T
		}
System.out.println();
//assign to variable		
		String word = "Wednesday";
		String reversed = "";
		for(int r = word.length() - 1; r >= 0; r--) {
		//	System.out.print(word.charAt(r));
		//read char and add to reversed
			reversed += word.charAt(r);
		}
		System.out.println(reversed); //yadsendeW
//check if it palindorome
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NOT Palindrome"); //NOT Palindrome
		}	
}}