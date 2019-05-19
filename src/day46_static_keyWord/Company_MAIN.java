package day46_static_keyWord;
public class Company_MAIN {
	public static void main(String[] args) {
//print "cName" variable value
		System.out.println(Company.cName);
		System.out.println(Company.cName.toUpperCase());
		
		Company.cName.toUpperCase();
		System.out.println();
		
		Company c = new Company();
		System.out.println(c.cName);
		c.companyInfo();
		Company.companyInfo();
}}