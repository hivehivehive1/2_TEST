package day23_AGENDA;
public class PrintWord {
	public static void main(String[] args) {
		String str = "java";
		//update statement
		for(int i = 0; i <= str.length() -1; i++) {
			//condition
			if(str.substring(i, i + 1).equals("a")) {
				//if condition is true, go back to update statement
				continue;
			}
			System.out.println(str.substring(i, i + 1)); //jv	
}}}