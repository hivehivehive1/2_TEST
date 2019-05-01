package day27_Arrays;
public class TOOLS {
	public static void main(String[] args) {
/* Java --> programming language
Selenium --> Test Automation
TestNG --> Unit Tests
JUnit --> Unit Tests
Cucumber --> BDD Style testing
Git --> Version control
Maven --> Building and execution for project*/
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
System.out.println("**************************************V_1***************");
		for(String tool : tools) {
			   switch(tool.toLowerCase()) {
			   case "java":
				   System.out.println("Java --> programming language");
				   break;
			   case "selenium":
				   System.out.println("Selenium --> Test Automation");
				   break;
			   case "testng":
			   case "junit":
				   System.out.println(tool+" --> Testing tool");
				   break;
			   case "cucumber":
				   System.out.println("Cucumber --> BDD Style testing");
				   break;
			   case "git":
				   System.out.println("Git --> Version control");
				   break;
			   case "maven":
				   System.out.println("Maven --> Building and execution for project");
				   break;
			   default:
				   System.out.println("Unknown tool");   

}}System.out.println("**************************************V_2***************");		
		for(int i = 0; i < tools.length; i++) {
				  if(tools[i] == "Java") {
				System.out.println("Programming language");
			}else if(tools[i] == "Selenium") {
				System.out.println("Test Automation");
			}else if(tools[i] == "TestNG") {
				System.out.println("Unit Tests");
			}else if(tools[i] == "JUnit") {
				System.out.println("Unit Tests");
			}else if(tools[i] == "Cucumber") {
				System.out.println("BDD Style testing");
			}else if(tools[i] == "Git") {
				System.out.println("Version control");
			}else if(tools[i] == "Maven") {
				System.out.println("Building and execution for project");
			}
}}}