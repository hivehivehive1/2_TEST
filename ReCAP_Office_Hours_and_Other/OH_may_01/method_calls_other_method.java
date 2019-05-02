package OH_may_01;
import java.text.DecimalFormat;
import java.util.Formatter;
public class method_calls_other_method {
	public static void main(String[] args) {
		
		System.out.println(milesTOkms(1));
		System.out.println(milesTOkms(10));
		
		double km = milesTOkms(1);
		System.out.println(km);
		
		System.out.println(multiply(5, 5));
		
		double litersValue = gallonsTOlitters(15);
		//format to 2 decimal points only
		DecimalFormat dm = new DecimalFormat("#.##");
		System.out.println(dm.format(litersValue));
		//get rid of decemal point value
		System.out.println(Math.floor(litersValue));
		
}////////////////////////////////////////////////////////////////////////////////
		public static double milesTOkms(double miles) {
			//double kmVALUE = miles * 1.609;
			double kmVALUE = multiply(miles, 1.609);
			return kmVALUE;
		}
		
		public static double multiply(double num1, double num2) {
			return num1 * num2;
			
}//=========================GALON to LITTERS=======================================
//multiply the volium value by 3.785		
		public static double gallonsTOlitters(double gallons) {
//local variable - variable declared in method	
			double literValue = multiply(gallons, 3.785);
			return literValue;
		}
}