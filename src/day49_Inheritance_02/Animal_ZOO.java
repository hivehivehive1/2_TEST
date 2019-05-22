package day49_Inheritance_02;
public class Animal_ZOO {
	public static void main(String[] args) {
		Animal_Leopard leo = new Animal_Leopard();
		System.out.println("-------------------------------");
		Animal_Leopard leo2 = new Animal_Leopard("Sharik");
		System.out.println(leo2.getType());
	}
}