package day39_arraylist_04;
import java.util.*;
public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
			numsList.add(10);
			numsList.add(10);
			numsList.add(7);
			numsList.add(8);
			numsList.add(8);
			numsList.add(3);
			numsList.add(4);
			numsList.add(8);
			printList(numsList);
			
			List<Double> doubleList = new ArrayList<>();
			doubleList.add(11.1);
			doubleList.add(22.2);
			doubleList.add(22.3);
			doubleList.add(33.3);
			doubleList.add(44.4);
			doubleList.add(55.5);
			doubleList.add(66.6);
			doubleList.add(77.7);
			System.out.println(sumList(doubleList));
			double sum = sumList(doubleList);
			System.out.println("Sum: " + sum);
			
			System.out.println(getList(10));
			ArrayList<Integer> list = getList(15);
			System.out.println(list.toString());
			
			//for(;;) { //infinity
			System.out.println(getRandomList(20));
//[87, 14, 90, 98, 97, 4, 83, 28, 50, 39, 11, 79, 89, 23, 56, 13, 75, 57, 16, 19]
			//}
			List<Integer> rList = getRandomList(10);
			Collections.sort(rList);
			System.out.println(rList); //[1, 10, 19, 53, 54, 59, 71, 82, 82, 87]
			
			printList( (ArrayList<Integer>) getRandomList(7)); //91 29 5 38 31 94 69
			
			List<String> strNums = new ArrayList<>();
			strNums.add("123");
			strNums.add("33");
			strNums.add("128");
			strNums.add("3");
			
			List<Integer> converted = convertToIntList(strNums);
			System.out.println(converted);
///////////////////////////////////////////////////////////////////////////////////////////////			
	}
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static double sumList(List<Double> dList) {
		double sum = 0.0;
		for(Double d : dList) {
			sum += d;
		}
		return sum;
	}
//3) getList
//	 return type: ArrayList<Intiger>
//	 params: int size
//	 getList(5); ==> [1,2,3,4,5]
		public static ArrayList<Integer> getList(int size) {
			ArrayList<Integer> newList = new ArrayList<>();
			for(int w = 1; w <= size; w++) {
				newList.add(w);
			}
			return newList;
		}
//4) getRandomList
//	 return type: List<Integer>
//	 params: int size
//	 getRandomList(5); ==> [1 > 100]
		public static List<Integer> getRandomList(int size) {
			Random r = new Random(); //Object of Random class
			List<Integer> randomNums = new ArrayList<>();
			for(int i = 1; i <= size; i++) {
				randomNums.add(r.nextInt(101));
			}
			return randomNums;
		}
//5) convertToIntList
//	 return type: List<Integer>
//	 Params: List<String>
//	It will take each string and conver to Integer and return as Integer list
//		List<String> strL = new ArrayList<>();
//		   strL.add("56");
//		   strL.add("99");
//		   convertToIntList(strL); => [56, 99] 
		public static List<Integer> convertToIntList(List<String> strList) {
	        List<Integer> newList = new ArrayList<>();
	        for(String str : strList) {
	            newList.add( Integer.parseInt(str) );
	        }
	        return newList;
	    }
}