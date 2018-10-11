
public class Fruit extends MarketProduct{
	
	private double weight;
	private int pricePerKg;
	
	//constructor
	public Fruit(String nameOfProduct, double weight, int pricePerKg) {
		super(nameOfProduct);
		this.weight = weight;
		this.pricePerKg = pricePerKg; 
	}
	
	public int getCost() {
		int cost = (int)(this.weight * this.pricePerKg);
		return cost;	
	}
	
	public boolean equals(Object o) {
		if(o instanceof Fruit) {
		Fruit fruit = (Fruit) o;
		return this.getName().equals(fruit.getName())
				&& this.weight == fruit.weight
				&& this.getCost() == fruit.getCost();
	}
		return false;
	}
}
