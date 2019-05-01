package _TEMP;
import java.util.Arrays;
public class TEMP_2 {
	public static void main(String[] args) {
		int[][] multiplicationTable = new int[10][10];

		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable.length; j++) {
				multiplicationTable[i][j] = (i + 1) * (j + 1);
				
			}
			System.out.println(Arrays.toString(multiplicationTable[i]));
		}

		// Do not modify below line it will be used to test your code. And
		// Can be used by you while developing your code
		System.out.println(Arrays.deepToString(multiplicationTable));
	}
}