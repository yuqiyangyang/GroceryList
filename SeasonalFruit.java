
public class SeasonalFruit extends Fruit{
	
	public SeasonalFruit(String nameOfProduct, double weight, int pricePerKg) {
		
		super(nameOfProduct, weight, pricePerKg); 
	}
	
	public int getCost() {
		int cost = (int)(super.getCost() * .85);
		return cost;
	}

}
