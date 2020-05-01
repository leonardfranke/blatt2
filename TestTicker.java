package blatt2;

public class TestTicker
{

	public static void main(String[] args)
	{
		TestTicker testclass = new TestTicker();
		testclass.testDestruction();

	}
	
	private void testDestruction() {
		Company company1 = new Company("Facebook");
		company1 = null;
		System.gc();
		while(true) {}
	}

}
