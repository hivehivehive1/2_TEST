package day18_while_down_hill_loops;
public class StairCase {
	public static void main(String[] args) {
		/*
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 */
        String stairs = "*";
        System.out.println(stairs);
        stairs = stairs + "*";
        System.out.println(stairs);
        stairs += "*";
        System.out.println(stairs);
        stairs += "*";
        System.out.println(stairs);
        stairs += "*";
        System.out.println(stairs);
        
        //1) with a counter
        String stairs1 = "*";
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs1);
			stairs1 += "*"; //**********
			num++;	
		}
		//2) checking length()
		String stairs2 = "*";
		while(stairs2.length() <= 10) {
			System.out.println(stairs2);
			stairs2 += "*"; //*********
}}}
