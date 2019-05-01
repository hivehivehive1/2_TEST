package day25_ARRAYS_ArrayList_Set_MAP;

import java.util.Scanner;

public class replit {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine()};
  String adik = "";
  for(int i = 0; i < words.length; i++) {
	  adik += words[i].substring(0, 1) + words[i].substring(words[i].length() - 1)+ ", ";
	  }
 System.out.println("[" + adik.replaceAll(", $","") + "]");

}}
