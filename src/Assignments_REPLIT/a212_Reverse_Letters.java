package Assignments_REPLIT;
import java.util.*;
public class a212_Reverse_Letters {
	public static void main(String[] args) {
				   //"G-F+E=D*C^B#A" //leave simbols
		String str = "A-B+C=D*E^F#G";
		System.out.println(str);
		String collectANDReverse = "";
		char[] cut = str.toCharArray();
		for (int i = 0; i < cut.length; i++) {
			if (Character.isAlphabetic(cut[i])) {
				collectANDReverse += cut[i];
			}
		}
		collectANDReverse = new StringBuilder(collectANDReverse).reverse().toString();
		char[] back = collectANDReverse.toCharArray();
		for (int i = 0, ii = 0; i < cut.length; i++) {
			if (Character.isAlphabetic(cut[i])) {
				cut[i] = back[ii++];
			}
		}
		String done = new String(cut);
		System.out.println(done);
}}