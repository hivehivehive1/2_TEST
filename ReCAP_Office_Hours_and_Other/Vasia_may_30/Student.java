package Vasia_may_30;

public class Student {
	//inctase variable
	private String school;
	//constractor
	public Student(String school) {
	  //this. => to inctans variable
		this.school = school;
	}
	public String toString() {
		return "student at " + school;
	}
}
/*Write a superclass Student that contains:
a constructor that accepts a String corresponding to the name of the school the student attends
a toString method that returns 'student at X' where X is the name of the school the student attends.

Then write a subclass HighSchoolStudent containing:
a constructor accepting a String which is used as a parameter to the superclass constructor
a toString method that returns 'high school student at X'. This method must use the toString 
method of its superclass.*/