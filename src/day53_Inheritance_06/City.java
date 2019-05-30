package day53_Inheritance_06;
public class City {
	
	private int id;
	private String name;
	
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return "id: " + id + "name:" + name;
	}
	
	
	@Override
	public String toString() {
		return "id: " + id + " name: " + name;
	}
	@Override
	public boolean equals(Object obj) {
		City anotherCity = (City) obj;
		if(this.id == anotherCity.id && this.name.equals(anotherCity.name)) {
			return true;
		}
		return false;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}