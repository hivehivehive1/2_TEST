package MyRoof_05_29;
public class PetSmart {

	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed = "persian cat";
		murodilsCat.name = "Bars";

		sellCat(murodilsCat);

		OnLineCat marufsImaginaryCat = new OnLineCat();
		marufsImaginaryCat.breed = "lebanese";
		marufsImaginaryCat.name = "Tars";
		marufsImaginaryCat.location = "Arlington,TX";
		sellCatOnline(marufsImaginaryCat);

		marufsImaginaryCat.makeSomeNoice();
	}

	public static void sellCat(Cat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("its name is " + cat.name);
	}
	public static void sellCatOnline(OnLineCat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("its name is " + cat.name);
		System.out.println("its location is " + cat.location);
	}
}