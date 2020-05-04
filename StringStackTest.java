package blatt2;

public class StringStackTest {

	public static void main(String[] args) {
		System.out.println("Starting tests");
		StringStackTest test = new StringStackTest();
		test.testStackCopy();
		System.out.println("Finished tests. Found " + Assertions.getErrors() + " errors.");

	}

	public void testStackCopy() {
		StringStack stack1 = new StringStack();
		stack1.push("First");
		stack1.push("Second");

		StringStack stack2 = new StringStack(stack1);

		Assertions.assertStringRef(stack1.pop(), stack2.pop(), "Error in testStackCopy of first element");
		Assertions.assertStringRef(stack1.pop(), stack2.pop(), "Error in testStackCopy of second element");
	}
}
