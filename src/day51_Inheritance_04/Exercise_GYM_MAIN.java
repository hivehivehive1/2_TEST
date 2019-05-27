package day51_Inheritance_04;

public class Exercise_GYM_MAIN {

	public static void main(String[] args) {
		Exercise e = new Exercise();
		Exercise_Running r = new Exercise_Running();
		Exercise_Swimming s = new Exercise_Swimming();
		Exercise_Yoga y = new Exercise_Yoga();
		Exercise_muraGONDON j = new Exercise_muraGONDON();
		Exercise_Sprinting sp = new Exercise_Sprinting();

		System.out.println( e.perform(30) );
		System.out.println( r.perform(40) );
		System.out.println( s.perform(45) );
		System.out.println( y.perform(60) );
		System.out.println( j.perform(60) );
	//	System.out.println( sp.perform(25));

		Exercise e2 = new Exercise_Running();
		System.out.println(e2.perform(33));

		System.out.println("====================");
		Exercise_SnowBoarding sn = new Exercise_SnowBoarding();
		System.out.println(sn.perform(100));

	}
}