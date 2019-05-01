package day24_ARRAYS;
public class CHARS {
	public static void main(String[] args) {
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.println(value);
}//-----------------------------------------------
	//toCharArray convert to character
	String str = "Wooden spoon";
    char[] chars = str.toCharArray();
    for(char c: chars) {
    	System.out.print(c); //Wooden spoon
}//-----------------------------------------------    
    System.out.println();
    str = "";
	for(int i = chars.length -1; i >= 0; i--) {
		str += chars[i];
	}
		System.out.println(str); //noops nedooW
//-----------------------------------------------
//Print chars with help of array of chars, one by one
//if chars is equals to 'o'
//replace it with '*' (print it instead of 'o'
	for(char c: chars) {
		if(c == 'o') {
			System.out.print("*");
		}else {
			System.out.print(c); //W**den sp**n
}}  }}