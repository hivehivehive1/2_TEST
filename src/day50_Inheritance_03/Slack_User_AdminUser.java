package day50_Inheritance_03;
public class Slack_User_AdminUser extends Slack_User {
	
	public Slack_User_AdminUser(String name) {
		super(name);
	}
	@Override
	public void sendAMessage(String message) {
		System.out.println("@channel");
		System.out.println(getName() + " is sending a message <" + message + ">");
	}
}