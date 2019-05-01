package day23_AGENDA;
public class num_from_1_till_50 {
	public static void main(String[] args) {

		for(int i = 1; i <= 50; i++) {
			if(i % 20 == 0) {
				break;
			}
			if(i % 5 == 0) {
				continue;
			}
			System.out.print(i + ",");
			}
}}
