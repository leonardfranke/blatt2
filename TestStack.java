package blatt2;


public class TestStack
{
	
	private int errors = 0;

	public static void main(String[] args)
	{
		TestStack test = new TestStack();
		
		test.testStackCopy();
		test.testArea();
		
		System.out.println(test.errors + " Fehler");

	}
	
	private void assertString(String str1, String str2, String errorMsg) {
		if(str1 == str2) {
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
	
	private void assertInt(int int1, int int2, String errorMsg) {
		if(int1 != int2) {
			System.out.println(errorMsg);
			this.errors++;
		}
	}
	
	
	private void testArea() {
		Arena arena = new Arena();	
		
		assertInt(arena.getArea(0.5,0.5), 2, "Error in testAre of first element");
		assertInt(arena.getArea(-0.5,0.5), 11, "Error in testAre of second element");
		assertInt(arena.getArea(0.5,-0.5), 5, "Error in testAre of third element");
		assertInt(arena.getArea(-0.5,-0.5), 8, "Error in testAre of fourth element");
		assertInt(arena.getArea(1.5,1.5), -1, "Error in testAre of border element");		
	
	}

}
