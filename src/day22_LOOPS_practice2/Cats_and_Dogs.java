package day22_LOOPS_practice2;
public class Cats_and_Dogs {
	public static void main(String[] args) {
        String str = "mycatyourcat";
        //count how many "cat" s
        int cats = 0;
        for(int i = 0; i <= str.length()-3; i++) {
            System.out.println(str.substring(i, i+3));
            if(str.substring(i, i+3).equals("cat") ) {
                cats++;
            }
        }
        
        System.out.println("Cats: " + cats);
    }
}