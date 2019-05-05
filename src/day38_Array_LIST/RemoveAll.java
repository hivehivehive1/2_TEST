package day38_Array_LIST;
import java.util.*;
public class RemoveAll {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		list2.add(77);
		
		System.out.println(list1);
		System.out.println(list2);
		//remove all matching values from list1
		list2.removeAll(list1);
		System.out.println(list2);
}}