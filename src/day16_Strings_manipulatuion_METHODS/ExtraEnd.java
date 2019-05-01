package day16_Strings_manipulatuion_METHODS;

public class ExtraEnd {

	public static void main(String[] args) {
		String str = "Java";
		String result = "";
		if(str.length() == 2) {
			result = str+str+str;
		}else {
			result = str.substring(str.length() -2);
			result += result + result;
		}
		System.out.println(result);
		int date1, date2;
		int num;
//		int date1 = num.Between(date1, date2).getDays();
	}

}
