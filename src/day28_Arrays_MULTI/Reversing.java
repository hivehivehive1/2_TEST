package day28_Arrays_MULTI;
import java.util.Arrays;
public class Reversing {
	public static void main(String[] args) {
		String sent = "you are NOT interesting person";
		//SLPIT by space
		String[] arrSent = sent.split(" ");
//count words
		System.out.println("number of words: " + arrSent.length);//number of words: 5
//printing to string
		System.out.println(Arrays.toString(arrSent));//[you, are, NOT, interesting, person]
//reverse
		String reversed = "";
		for(int i = arrSent.length - 1; i >= 0; i--) {
		System.out.println(arrSent[i]);
		reversed += arrSent[i] + " ";
	//	System.out.println(reversed);
		}
		reversed = reversed.trim();
		System.out.println(reversed);//person interesting NOT are you
}}




//Scanner scan = new Scanner(System.in);
//String sent = scan.nextLine();
//String rev = "";
//
//String[] aRRsent = sent.split(" ");
//
//for(int i = aRRsent.length - 1; i >= 0 ; i--){
//  rev += aRRsent[i] + " ";
//}
//System.out.println(rev.trim());
//
//}}}