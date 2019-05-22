package day48_Inheritance;
public class Person_MAIN {
	public static void main(String[] args) {
		Person person = new Person();
		Person_Student student = new Person_Student();
System.out.println("================= hive =====================");		
		person.name = "hive";
		person.age = 36;
		person.gender = 'M';
		person.eat("5 Barmak");
		person.walk();
		person.sleep(8);
System.out.println("================== Vasia ====================");
		student.name = "Vasia";
		student.age = 30;
		student.gender = 'm';
		student.eat("Ganja");
		student.walk();
		student.sleep(5);
System.out.println("================= Tutka ======================");
		Person_Student student2 = new Person_Student();
		student2.name = "Tutka";
		student2.age = 30;
		student2.gender = 'm';
		student2.studentID = 1010;
		student2.clazz = "Agail Scram";
		student2.code("Java");
		student2.attendClass();
		student2.eat("Shashlyk");
		student2.walk();
		student2.code("Delphi");
}}