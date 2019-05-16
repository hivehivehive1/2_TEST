package day45_encapsulation_practice;
import java.util.Random;
public class EtsyAccount {
	private String email;
	private String firstName;
	private String password;
//constructor 1. No-args. sets all as empty string
	public EtsyAccount() {
		email     = "";
		firstName = "";
		password  = "";
	}
//constructor 2. takes 3 args and sets them to instance variables, using setters
	public EtsyAccount(String email, String firstName, String password) {
		this.setEmail(email);
		setFirstName (firstName);
		setPassword  (password);
	}//////////////////////////////RANDOM PASSWORD////////////////////////////////////////////
//constructor 3. Email, firstName => call settes method
//password is auto generated and assigned
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();
		
	}
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for(int i = 1; i <= 6; i++) {
			rdPassword += letters.charAt(rd.nextInt(letters.length()));
		}
		return rdPassword;
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "EtsyAccount [ Email = " + email + ", FirstName = " + firstName + ", Password = " + password + " ]";
	}

	public String getEmail() {
		return email;
	}
/////////////////////////////////email/////////////////////////////////////////////////////////
	public void setEmail(String email) {
//if it contains "@" somewehere in the middle. Assign it
//if not print "Please enter a valid email adress."
		if(email.indexOf("@") > 0 && email.indexOf('@') < email.length() - 1) {
			this.email = email;
		}else {
			System.out.println("Please enter a valid email adress.");
		}
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	public String getFirstName() {
		return firstName;
	}
///////////////////////////////////firstName///////////////////////////////////////////////////
	public void setFirstName(String firstName) {
// Can't be blank. need to be letters
		if(isValidFirstName(firstName)) {
			this.firstName = firstName;
	}else {
		System.out.println("Your first name contains invalid characters.");
	}
}
//valid ==> all letters, can have space in middle
//invalid ==> can't contain numbers or any other chars
	private boolean isValidFirstName(String firstName) {
		//check first if it starts with or ends with space
		//return false if true
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		if(firstName.isEmpty()) {
			System.out.println("Can't be blank");
			return false;
		}
		
		for(int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i); // %
			if(!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
	return true;
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	public String getPassword() {
		return password;
	}
///////////////////////////////////password////////////////////////////////////////////////////
    public void setPassword(String password) {
        if(password.length() < 6) {
            System.out.println("Must be at least 6 characters.");
            this.password = "";
        }else {
            this.password = password;
        }
    }
}