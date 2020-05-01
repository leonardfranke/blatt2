package blatt2;

public class Ticker
{
	
	private static Ticker instance;
	
	private Ticker() {
		
	}
	
	public static Ticker getInstance() {
		if(Ticker.instance == null) {
			Ticker.instance = new Ticker();
		}
		return instance;
	}
	
	
	public void print(String text) {
		String message = "+++" + text.replaceAll("\n", "");
		System.out.println(message);
	}
}
