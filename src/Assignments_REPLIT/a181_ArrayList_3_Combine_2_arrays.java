package Assignments_REPLIT;
import java.util.*;
public class a181_ArrayList_3_Combine_2_arrays {
	public static void main(String[] args) {
		String[] r1 = {"f", "o", "o"};
		String[] r2 = {"b", "a", "r"};
		String[] cc = new String[r1.length + r2.length];

		for (int i = 0; i < r1.length; i++) {
			cc[i] = r1[i];
		}
		for (int i = 0; i < r2.length; i++) {
			cc[(cc.length - r2.length) + i] = r2[i];
		}
		ArrayList<String> c = new ArrayList<>();
		for (String comp : cc) {
			c.add(comp);
		}
		String notepad2 = "";
		for (String notepad : c) {
			notepad2 += notepad;
		}
		System.out.println(notepad2);
}}