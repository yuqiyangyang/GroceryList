//Yuqi Yang 260365378

public class Basket {

	private MarketProduct[] marketProduct;

	public Basket() { 
		this.marketProduct = new MarketProduct[0];//initial field with empty array
	}

	public MarketProduct[] getProducts() {
		MarketProduct[] shallowCopy = new MarketProduct[this.marketProduct.length];
		for(int i = 0; i < this.marketProduct.length; i++) {
			shallowCopy[i] = this.marketProduct[i];
		}
		return shallowCopy;
	}

	public void add(MarketProduct product) {
		
		MarketProduct[] addProduct = new MarketProduct[this.marketProduct.length + 1];
		if (this.marketProduct.length != 0) {
	 		for(int i = 0; i < this.marketProduct.length; i++) {
				addProduct[i] = this.marketProduct[i];
			}
			addProduct[addProduct.length - 1] = product;
		} else {
			addProduct[0] = product;
		}
		this.marketProduct = addProduct;

	}

	public boolean remove(MarketProduct product) {
		int indexRemove = -1; //create a variable to find index of product need to be removed
		
		for(int i = 0; i < this.marketProduct.length; i++) {
			if (marketProduct[i].equals(product)) {
				indexRemove = i;
				break;
			}	
		}
		if(indexRemove == -1) {
			return false;
		}
		//if not false, update array of MarketProduct
		MarketProduct[] updateProducts = new MarketProduct[this.marketProduct.length - 1];
		for(int j = 0; j < updateProducts.length; j++) {
			if(j < indexRemove) {
				updateProducts[j] = this.marketProduct[j];
			}else {
				updateProducts[j] = this.marketProduct[j+1];
			}
		}
		this.marketProduct = updateProducts;
		return true;
	}

	public void clear() {
		//empty array of product of this Basket
		this.marketProduct = new MarketProduct[0];
	}

	public int getNumOfProducts() {
		return this.marketProduct.length;
	}

	public int getSubTotal() {
		int subTotal = 0;
		for(int i = 0; i < this.marketProduct.length; i++) {
			subTotal = subTotal + this.marketProduct[i].getCost();
		}
		return subTotal;
	}

	public int getTotalTax() {
		int totalTax = 0;
		for(int i = 0; i < this.marketProduct.length; i++) {
			if (this.marketProduct[i] instanceof Jam){
				totalTax = totalTax + (int)(this.marketProduct[i].getCost() * .15);
			}
		}
		return totalTax;
	}

	public int getTotalCost() {
		int totalCost = this.getSubTotal() + this.getTotalTax();
		return totalCost;
	}

	public String toString() {

		String receipt = "";
		for(int i = 0; i < this.marketProduct.length; i++) {
			receipt = receipt + this.marketProduct[i].getName() + "\t" + printToCents(this.marketProduct[i].getCost()) + "\n";
		}

		String receiptTotal = receipt + "\n" + "Subtotal\t" + printToCents(this.getSubTotal()) + "\n" + "Total Tax\t" + printToCents(this.getTotalTax()) + 
				"\n\n" + "Total Cost\t"+ printToCents(this.getTotalCost());
		return receiptTotal;
	}

	private String printToCents(int number) {//helper method
		if (number <= 0) {
			return "-";
		} else {
		String output = String.format("%.2f", (double)number/100);
		return output;
		}
	}











}
