package day39_arraylist_04;
public class School {
	public static void main(String[] args) {
//create object from student class
		Student student = new Student();
		student.name = "Brad Pit";
		student.age = 666;
		student.subject = "Java";
		
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("Subject: " + student.subject);
		
		Student student2 = new Student();
		//System.out.println(student2.name);
		student2.name = "TANOS";
		student2.age = 999;
		student2.subject = "KILL";
		System.out.println("Name: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("Subject: " + student2.subject);
}}