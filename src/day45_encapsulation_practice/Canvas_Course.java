package day45_encapsulation_practice;
import java.util.*;
public class Canvas_Course {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
System.out.println("======================Teachers===========================================");		
		List<String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Adik");
		javaTeachers.add("Urma");
		javaTeachers.add("Jinka");
		javaTeachers.add("Nurik");
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
//Course [ Name = Java Programming, Teachers = [Adik, Urma, Jinka, Nurik], Students = [] ]	
System.out.println("\n=======================Students==========================================");
		List<String> javaStudents = new ArrayList<>();
		javaStudents.add("Nurik");
		javaStudents.add("Jinka");
		javaStudents.add("Urma");
		javaStudents.add("Adik");
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
//Course [ Name = Java Programming, Teachers = [Adik, Urma, Jinka, Nurik], Students = [Nurik, Jinka, Urma, Adik] ]		
System.out.println("\n=====================ADD=================================================");
		course1.addTeacher("Putin");
		course1.addStudent("Dmitry");

		if(course1.getTeachers().contains("Putin")) {
			System.out.println("Putin is a teacher");
		}else {
			System.out.println("Putin is not a teacher");
		}
//Putin is a teacher		
		if(course1.getStudents().contains("Dmitry")) {
			System.out.println("Dmitry is a teacher");
		}else {
			System.out.println("Dmitry is not a teacher");
		}
//Dmitry is a teacher
System.out.println("\n=======================REMOVE============================================");		
		course1.removeTeacher("Putin");
		course1.removeStudent("Dmitry");
		
		if(!course1.getTeachers().contains("Adik")) {
			System.out.println("Adik is removed successfully");
		}else {
			System.out.println("Adik is still a teacher");
		}
//Adik is still a teacher		
		if(!course1.getStudents().contains("Urma")) {
			System.out.println("Urma is removed successfully");
		}else {
			System.out.println("Urma is still a student");
		}
//Urma is still a student
}}