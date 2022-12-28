/*
 * Kurt Kangas
 * CIS 2212 Java Software Development I
 * Asset Inheritance - Practice with Inheritance
 */

public class Stock extends Asset {
	
	// Attributes (instance variables)
	private String TickerSymbol;
	private int Shares;
	private int Price;
	// Constructors
	public Stock(String Object1, int Object2, int Object3, String sTickerSymbol, int sShares, int sPrice) {
		super(Object1, Object2, Object3);
		TickerSymbol = sTickerSymbol;
		Shares = sShares;
		Price = sPrice;
	}
	// Behaviors (methods)
	public String getTickerSymbol() {
		return TickerSymbol;
	}
	public void setTickerSymbol(String tickerSymbol) {
		TickerSymbol = tickerSymbol;
	}
	public int getShares() {
		return Shares;
	}
	public void setShares(int shares) {
		Shares = shares;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public int computeValue() {
		return (Price * Shares);
	}
	
	
	
}
