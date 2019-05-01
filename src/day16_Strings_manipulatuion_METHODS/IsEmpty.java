package day16_Strings_manipulatuion_METHODS;
public class IsEmpty {
	public static void main(String[] args) {
		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());
		
		if(userName.isEmpty()) {
			System.out.println("Username field cannot be empty"); //Username field cannot be empty
		}else {
			System.out.println("Username is not empty");
		}
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can't be empty"); //Username or password can't be empty
		}else {
			System.out.println("Username or password is not empty");
		}
		if(userName.length() == 0) {
			System.out.println("Username length is 0, so it is empty"); //Username length is 0, so it is empty
		}

}}
