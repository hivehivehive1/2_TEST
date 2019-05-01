package day05_math_operator;

public class CompanyWarmUp {

	public static void main(String[] args) {
		String companyName = "AM Corp";
		String address = "666 JALAP ST.";
		int numberOfEmployees = 666;
		int revenue = 1000000000;
		boolean isTechCompany = true;
		boolean noTechCompany = false;
		
		System.out.println("Company name is "+companyName);
		System.out.println("Adress is "+address);
		System.out.println("Number of SVLAVES is "+numberOfEmployees);
		System.out.println("TOTAL INCOM is "+revenue+"$");
		System.out.println("TechComp? "+noTechCompany);
		
		String about = (" doing good for MANS to get chill");
		
		System.out.println(companyName+about+", Company located on "+address+". "+
		"This company has a "+numberOfEmployees+" SLAVES "+
		"and anual incom of this AMAZYN company "+revenue+ "$ . "+
		"BUT this company never working in IT industry "+isTechCompany);
		
		String aboutCompany = "Company "+companyName+" is located in "+address+
		" and "+numberOfEmployees+ " work for it. ";
		System.out.println(aboutCompany);
	}}