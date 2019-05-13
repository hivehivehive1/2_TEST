package _TEMP;
import java.util.*;
class TEMP_1 {
	  public static void main(String[] args) {
		   System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
		   System.out.print(lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
		   System.out.print(lameDb("1tst#2bla#3foo","delete","1","")+"\n");
		   System.out.print(lameDb("1tst#2bla#3foo","none","1","")+"\n");
	  }
  public static String lameDb(String db, String op,String id,String data) {
	  		//  0      1      2
	  		//1etsy 2wooden 3spoon
	  String[] str = db.split("#");
	    ArrayList<String> result = new ArrayList<>();
	    for (String s : str) {
	      result.add(s);
	    }
          //1etsy#2wooden#3spoon
          //1etsy#2wooden#3spoon#4aaa	    
	    if (op.contentEquals("add")) {
	      result.add((result.size() + 1) + "" + data);
	      
          //1test#2bla#3foo ==> 2bbb
          //1test#2bbb#3foo	      
	    } else if (op.contentEquals("edit")) {
	      result.remove(Integer.parseInt(id) - 1);
	      result.add(Integer.parseInt(id) - 1, Integer.parseInt(id) + "" + data);
	      
          //1tst#2bla#3foo
          //    #2bla#3foo
	    } else if (op.contentEquals("delete")) {
	      result.remove(Integer.parseInt(id) - 1);
	    }
          //1tst#2bla#3foo  none)
          //1tst#2bla#3foo
	    String str1 = "";
	    for (int i = 0; i < result.size(); i++) {
	      if (i == result.size() - 1) {
	        str1 += result.get(i);
	      } else {
	        str1 += result.get(i) + "#";
	      }
	    }
	    return str1;
	   
	 }//end lameDb
	 
//	  public static void main(String[] args) {
//	   System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
//	   System.out.print(lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");
//	   System.out.print(lameDb("1tst#2bla#3foo","delete","1","")+"\n");
//	   System.out.print(lameDb("1tst#2bla#3foo","none","1","")+"\n");	   
}