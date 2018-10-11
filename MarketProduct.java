//Yuqi Yang 260365378

public abstract class MarketProduct {
	private String name;
	
	public MarketProduct(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public abstract int getCost();//abstract class does not have implement
	
	public abstract boolean equals(Object o);
		

}
