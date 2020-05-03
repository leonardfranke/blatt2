package blatt2;

/**
 * Represents a company 
 * @author Leonard Franke
 *
 */
public class Company
{
	/**
	 * Name of the company.
	 */
	private String name;
	
	/**
	 * Constructs the company with a specific name.
	 */
	public Company(String name) {
		this.name = name;
	}
	
	/**
	 * Sends stock price changes to the ticker.
	 */
	public void changeStockPrice(double d) {
		Ticker.getInstance().print(name + ": " + d);
	}
	
	/**
	 * When the company gets destroyed it sends a message to the ticker.
	 */
	protected void finalize() {
		Ticker.getInstance().print(name + ": Insolvent");
	}
	
	
}