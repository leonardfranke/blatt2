package blatt2;

public class Company
{
	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public void changeStockPrice(double d) {
		Ticker.getInstance().print(name + ": " + d);
	}
	
	protected void finalize() {
		Ticker.getInstance().print(name + ": Insolvent");
	}
	
	
}