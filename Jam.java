//Yuqi Yang 260365378

public class Jam extends MarketProduct {

	private int numberOfJars;
	private int pricePerJars;
	
	public Jam (String nameOfProduct, int numberOfJars, int pricePerJars) {
		super(nameOfProduct);
		this.numberOfJars = numberOfJars;
		this.pricePerJars = pricePerJars; 
	}
	
	public int getCost() {
		int cost = this.numberOfJars * this.pricePerJars;
		return cost;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Jam) {
		Jam jam = (Jam) o;
		return this.getName().equals(jam.getName())
				&& this.numberOfJars == jam.numberOfJars
				&& this.getCost() == jam.getCost();
	}
		return false;
	}
	
}
