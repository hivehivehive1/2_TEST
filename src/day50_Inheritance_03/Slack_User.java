package day50_Inheritance_03;

public class Slack_User {
	
	private String name;
	
	public Slack_User(String name) {
	this.name = name;
	}
	
	public void sendAMessage(String message) {
		System.out.println(name + " is sending a message <" + message + ">");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}