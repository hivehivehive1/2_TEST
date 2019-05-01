package day13_ternary_STRINGS_intro;
public class Ternary {
	public static void main(String[] args) {
		String result;
		int score = 88;
//==== 1 version
		if(score > 60) {
			result = "pass";
		}else {
			result = "fail";
		}
//==== 2 version
		result = (score > 60) ? "pass" : "fail"; // =>() no need!
		
		System.out.println("Result is " + result);		
}}
