package MyRoof_05_21;
public class EmailGenerator {
	static String companyName = "Google";
	
	String name;
	
	public EmailGenerator(String name) {
		this.name = name;
	}
	public String getEmail() {
		return name + "@" + companyName + " .com";
	}
	
	
	
	
}