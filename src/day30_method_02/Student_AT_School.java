package day30_method_02;
public class Student_AT_School {
	public static void main(String[] args) {
		study("html");
		study("SQL");
		sleep(1);
	}
		public static void study(String topic) {
		System.out.println("Student is studying " + topic);
	}
		public static void sleep(int hours) {
		System.out.println("Student has been sleeping " + hours + " hours SUKA!");
}}