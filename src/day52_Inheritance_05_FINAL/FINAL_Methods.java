package day52_Inheritance_05_FINAL;
public class FINAL_Methods {
	public final void method1() {
		System.out.println("Final method 1");

	}

	public final static void staticMethod(String word) {
		System.out.println("staticMethod: " + word);
	}
}

class Sub extends FINAL_Methods {
// cannot override since it is a final method.
// public void method1() {
// System.out.println("Overrided method 1");
//	}

	public void method1(String str) {
		System.out.println("Overrided method 1 " + str);
	}

//	public final static void staticMethod(String word) {
//		System.out.println("staticMethod: " + word);
//	}
  
}