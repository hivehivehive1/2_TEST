package day47_blocks;
public class All_Blocks {
	int nonStaticInt = 10;
	static int staticInt = 10;
	
	static {
		System.out.println("static block - I run first and only once");
		staticInt--;
	}
	
	{
		System.out.println("INIT BLOCK - I run each time objec is created. Before constructor");
		nonStaticInt += 5;
		staticInt += 5;
				
	}
	
	public All_Blocks() {
		System.out.println("CONSTRUCTOR - I run each time object is created. After INIT BLOCKS");
		nonStaticInt += 3;
		staticInt += 3;
	}
	
	
}
