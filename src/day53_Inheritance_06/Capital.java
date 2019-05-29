package day53_Inheritance_06;
public class Capital extends City {
	
	private long population;
	
	public Capital(int id, String name, long population) {
		super(id, name);
		this.population = population;
	}
	@Override
	public String toString() {
		return super.toString() + " population: " + population;
	}
	
	
	public void setPopulation(long population) {
		
	}

}
