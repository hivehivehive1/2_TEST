package day16_Strings_manipulatuion_METHODS;
import java.util.Scanner;
public class WarmUp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter url: ");
		String url = s.next();
		//check WWW.
		if(url.startsWith("www.")) {
			System.out.println("(www.) is present");
		}else {
			System.out.println("Invalid url format!");
		return;
		}//check '.' is there right before extension
		int dotIndex = url.length() - 4;
		//url.lastIndexOf()
		if(url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");
		}else {
			System.out.println(". might be misplaced");
		}// get domain and extension
		String domain = url.substring(4, dotIndex);
		System.out.println(domain);
		String extension = url.substring(dotIndex + 1, url.length());
		System.out.println("Extension:" + extension);
}}