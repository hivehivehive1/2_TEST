package day24_ARRAYS;
import java.util.Arrays;
public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumber = {1, 10, 11, 5, 66, 6};
		System.out.println(Arrays.toString(lotteryNumber)); //[1, 10, 11, 5, 66, 6]
		Arrays.sort(lotteryNumber);
		System.out.println(Arrays.toString(lotteryNumber)); //[1, 5, 6, 10, 11, 66]
//binary search works only with sorted array
		int index = Arrays.binarySearch(lotteryNumber, 6);
		System.out.println("Position: " + index); //Position: 2
//if value doesn't exist
		int index2 = Arrays.binarySearch(lotteryNumber, 100000000);
		System.out.println("Position: " + index2); //-7
		
}}
