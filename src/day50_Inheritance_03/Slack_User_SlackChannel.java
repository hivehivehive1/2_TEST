package day50_Inheritance_03;
public class Slack_User_SlackChannel {
	public static void main(String[] args) {
		Slack_User su = new Slack_User("MudakUser");
		Slack_User_AdminUser au = new Slack_User_AdminUser("Mudak");
		
		su.sendAMessage("Mudak");
		au.sendAMessage("Mudak is There?");
}}