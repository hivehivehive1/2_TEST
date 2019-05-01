package day19_LOOPS;
public class Do_While_RunOnce {
	public static void main(String[] args) {
		//in this example, do while loop body code will run
		//once then test the condition. then exit the loop,
		//as condition is false
		int count = 10;
		do {
			System.out.println("Count: " + count);
			count++;
		}while(count <= 14);
}}