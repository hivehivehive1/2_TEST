package day15_Strings_manipulatuion;
public class Google_Search_Test {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";
		//sets if pageTitle starts with item
		if(pageTitle.startsWith(item)) { //"java"
			System.out.println("PASS: Page titel check passed");
		}else {
			System.out.println("FAIL: Page title check faild!");
		}
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google search is in title");
		}else {
			System.out.println("FAIL: Google search is not in title");
		}
}}
