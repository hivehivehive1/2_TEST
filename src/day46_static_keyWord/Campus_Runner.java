package day46_static_keyWord;
public class Campus_Runner {
	public static void main(String[] args) {
		Campus campus1 = new Campus("Bishkek");
		Campus campus2 = new Campus("Moscow");
		Campus campus3 = new Campus("DC");
		Campus.campusInfo();
		
		System.out.println(Campus.country);
}}