package blatt2;

public class TickerTest {
	public static void main(String[] args) {
		TickerTest test = new TickerTest();
		test.testDestruction();
	}

	public void testDestruction() {
		Company fb = new Company("Facebook");
		Company apple = new Company("Apple");
		Company microsoft = new Company("Microsoft");

		fb = null;
		apple = null;
		microsoft = null;

		System.gc();
		while (true) {
		}
	}
}
