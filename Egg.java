

public class Egg extends MarketProduct{
	
	private int numberOfEggs;
	private int pricePerDozen;
	
	
	//constructor takes input
	public Egg(String nameOfProduct, int numberOfEggs, int pricePerDozen) {
		super(nameOfProduct);
		this.numberOfEggs = numberOfEggs;
		this.pricePerDozen = pricePerDozen;
	}
	public int getCost() {
		int cost = (int)((double)this.pricePerDozen/12 * this.numberOfEggs);
		return cost;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Egg) {
		Egg egg = (Egg) o;
		return this.getName().equals(egg.getName())
				&& this.numberOfEggs == egg.numberOfEggs
				&& this.getCost() == egg.getCost();
	}
		return false;
	}
}
