package OH_april_22;
public class iS_Number_Present {
	public static void main(String[] args) {
		int n = 55;
		int []nums = {22,33,44,55,67,78};
		isNumberPresent(n, nums);	
	}
	public static void isNumberPresent(int n, int[] arr) {
		boolean present = false;
		for(int num: arr) {
			if(num == n) {
				present=true;
				break;
			}
		}
		System.out.println("Is " + n + " present? - " + present);
	}
}