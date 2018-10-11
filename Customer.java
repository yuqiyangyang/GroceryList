

public class Customer {

	private String nameCustomer;
	private int balance;
	private Basket productsToBuy;
	
	public Customer(String nameCustomer, int balance) {
		this.nameCustomer = nameCustomer;
		this.balance = balance;
		this.productsToBuy = new Basket();	//create empty basket by calling Basket
	}
	
	public String getName() {
		return this.nameCustomer;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public Basket getBasket() {
		return this.productsToBuy;
	}
	
	public int addFunds(int addBalance) {
		if (addBalance < 0) {
			throw new IllegalArgumentException("amount can not be negative!");
		}else {
			this.balance = this.balance + addBalance;
			return this.balance;
		}
	}
	
	public void addToBasket(MarketProduct product) {
		this.productsToBuy.add(product);
	}
	
	public boolean removeFromBasket(MarketProduct product) {
		return this.productsToBuy.remove(product);
	}
	
	public String checkOut() {
		if(this.balance < this.productsToBuy.getTotalCost()) {
			throw new IllegalStateException("Sorry, your balance is not enough!");
		}
		this.balance = this.balance - this.productsToBuy.getTotalCost();
		String receiptPrint = this.productsToBuy.toString();
		this.productsToBuy.clear();
		return receiptPrint;	
	}
}

