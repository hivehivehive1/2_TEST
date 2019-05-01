package day12_SWITCH_ternary;
public class Switch_Score {
	public static void main(String[] args) {
		int score = 123;
		switch(score) {
			case 1:
				System.out.println("Score is 1");
				break; // EXIT switch statement
			case 2:
				System.out.println("Score is 2");
				break;
			case 3:	
				System.out.println("Score is 3");
				break;
			default: // this is like else!
				System.out.println("Invalid score");
				break; //exit without this as well
}}}