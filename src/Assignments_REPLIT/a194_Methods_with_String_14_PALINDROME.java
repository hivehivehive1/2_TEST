package Assignments_REPLIT;
public class a194_Methods_with_String_14_PALINDROME {
	public static void main(String[] args) {
		String check = "Nurses Run";
		check = check.replace(" ", "");
		String p = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			p += check.charAt(i) + "";
		}
		if (p.equalsIgnoreCase(check)) {
			System.out.println(p);
		}
}}