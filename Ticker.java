package blatt2;

/**
 * Ticker which prints the newest stock changes
 * @author Leonard Franke
 *
 */
public class Ticker
{
	/**
	 * Singelton instance
	 */
	private static Ticker instance;
	
	/**
	 * Private empty constructor
	 */
	private Ticker() {}
	
	/**
	 * Returns the only instance of this class
	 * @return the existing ticker object or creates a new
	 */
	public static Ticker getInstance() {
		if(Ticker.instance == null) {
			Ticker.instance = new Ticker();
		}
		return instance;
	}
	
	/**
	 * Prints out stock changes
	 * @param text the message which is to print
	 */
	public void print(String text) {
		String message = "+++" + text.replaceAll("\n", "");
		System.out.print(message);
	}
}
