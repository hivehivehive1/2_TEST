package day46_static_keyWord;
public class Campus {
		String city;
 static String country;
		
		static {
			System.out.println("static block");
			country = "USA";
		}
		static {
			System.out.println("static block - 2");
			country = "Canada";
		}
		
		public Campus(String city) {
			System.out.println("Constructor");
			this.city = city;
		}
		public static void campusInfo() {
			System.out.println("Welcome to campus");
		}
		@Override
		public String toString() {
			return "Campus [city = " + city + " ]";
		}

		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
}