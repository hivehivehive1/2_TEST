package _TEMP;
import java.util.*;
public class TEMP_2 {
	public static void main(String[] args) {

		
String str = "a";

char c1 = str.charAt(0); //c1='a';
char c2 = str.charAt( -1);

		

		 if(str.length() <= 1){
		 System.out.println(str);
		 }else{

		  System.out.println(str.substring(0, str.length() - 2) + c1 + c2);
		 }
		}}
