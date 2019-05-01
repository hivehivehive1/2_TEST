package OH_april_24;
public class Uniq_CHAR {
	public static void main(String[] args) {
		String str = "jjavabook"; //searching uniq char = 'v', 'b', 'k';
		//OUTER loop will take one chat at a time
		for(int i = 0; i < str.length(); i++) {
			char uniq = str.charAt(i); //j
			//INNER loop will help compare with other chars
			//set count as 0 each time
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				//compare each char with uniq
				if(uniq == str.charAt(j) && i != j) {
				//	System.out.println(uniq + " <== is duplicated");
					//if it is a match, insreas count by 1
					count++;
					break;
				}
			}	
			//outside inner loop check if count is still 0
			//if count is 0 then is uniq 
			if(count == 0) {
				System.out.print(uniq + ", ");
			}
		}	
}}
