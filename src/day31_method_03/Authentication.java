package day31_method_03;
public class Authentication {
	public static void main(String[] args) {
		/*	Name: login
		 * 	Return type : void
		 * 	2 String args/pars: username, password
		 * 	Inside the method:
		 * 	validUsername = "mentoring@cyberteckschool.com"
		 * 	validPassword = "mentor001"
		 * 
		 * 	if username and password match, print "Login Successful! Welcome to Okta"
		 * 	if not: "Sign in failed!"
		 */
		login("mentoring@cyberteckschool.com", "mentor001");//Login Successful! Welcome to Okta
		login("MENTORING@cyberteckschool.com", "mentor001");//Login Successful! Welcome to Okta
		login("mentoring@cyberteckschool.com", "m00000000");//Sign in failed!
		
	}
	public static void login(String username, String password) {
		String validUsername = "mentoring@cyberteckschool.com";
		String validPassword = "mentor001";
		
		if(username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful! Welcome to Okta");
		}else { 
			System.out.println("Sign in failed!");
	}
}}