package MyRoof_05_21;
public class People {
	String hardToGet = "Nursultan";
	
	static String easyToGet = "Muhtar";
	
	public void sayMyName() {
		System.out.println(hardToGet); //Nursultan
//non static methdo can call static variable		
		System.out.println(easyToGet); 
	}
	public static void whatMyName() {
		System.out.println(easyToGet);//Muhtar
// next line will throw error becouse static method can't call non static variable		
//		System.out.println(hardToGet); non static!
		
	}
	
	
	
}