package blatt2;


public class TestClass
{
	
	private int errors = 0;

	public static void main(String[] args)
	{
		TestClass test = new TestClass();
		System.out.println("Test started");
		
		test.testStackCopy();
		test.testArea();
		test.testDestruction();
		
		System.out.println(test.errors + " Fehler");
		System.out.println("Test finished");

	}
	
	private void assertString(String str1, String str2, String errorMsg) {
		if(str1 == str2) {
			System.out.println(errorMsg);
			this.errors++;
		}
	}
	
	private void assertInt(int int1, int int2, String errorMsg) {
		if(int1 != int2) {
			System.out.println(errorMsg);
			this.errors++;
		}
	}
	
	private void testStackCopy() {
		StringStack stack1 = new StringStack();
		stack1.push("First");
		stack1.push("Second");
		
		StringStack stack2 = new StringStack(stack1);
		
		assertString(stack1.pop(), stack2.pop(), "Error in testStackCopy of first element");		
		assertString(stack1.pop(), stack2.pop(), "Error in testStackCopy of second element");		
	}	
	
	private void testArea() {
		Arena arena = new Arena();	
		
		assertInt(arena.getArea(0.5,0.5), 2, "Error in testAre of first element");
		assertInt(arena.getArea(-0.5,0.5), 11, "Error in testAre of second element");
		assertInt(arena.getArea(0.5,-0.5), 5, "Error in testAre of third element");
		assertInt(arena.getArea(-0.5,-0.5), 8, "Error in testAre of fourth element");
		assertInt(arena.getArea(1.5,1.5), -1, "Error in testAre of border element");		
	
	}	
	
	private void testDestruction() {
		Company company1 = new Company("Facebook");
		company1 = null;
		System.gc();
	}

}