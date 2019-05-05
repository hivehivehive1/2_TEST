package day38_Array_LIST;
import java.util.*;
public class MethodsSummary {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//add method to add a value
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		//add method with index: "yellow will be placed to index 0"
		list.add(0, "yellow");
		//toString method to print all values in same line
		System.out.println(list);
		//size method. return number of values
		System.out.println("Number of elements: " + list.size());
		//get metthod .return value from index
		System.out.println("3: " + list.get(3));
		System.out.println("0: " + list.get(0));
		//remove using index. removes value from index position
		list.remove(0); //remove yello from index 0
		System.out.println(list);
		//remove using value/element. removes element first occurence
		list.remove("blue"); //remove blue
		System.out.println(list);
		//set(index, value) replace certain index with new value
		list.set(0, "orange");//red will be replaced by orange
		System.out.println(list);
		//indexOf(value). returns index of value in the list
		System.out.println("grey: " + list.indexOf("grey"));
		System.out.println("green: " + list.indexOf("green"));	
}}