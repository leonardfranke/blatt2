package blatt2;

public class ArenaTest {
	public static void main(String[] args) {
		System.out.println("Starting tests");
		ArenaTest test = new ArenaTest();
		test.testArea();
		System.out.println("Finished tests. Found " + Assertions.getErrors() + " errors.");
	}

	private void testArea() {
		Arena arena = new Arena();

		Assertions.assertInt(arena.getArea(0.5,0.5), 2, "Error in testArea, both coordinates positive");
		Assertions.assertInt(arena.getArea(-0.5,0.5), 11, "Error in testArea, x negative, y positive");
		Assertions.assertInt(arena.getArea(0.5,-0.5), 5, "Error in testArea, x positive, y negative");
		Assertions.assertInt(arena.getArea(-0.5,-0.5), 8, "Error in testArea, both coordinates negative");
		Assertions.assertInt(arena.getArea(1.5,1.5), -1, "Error in testArea, coordinates out of bounds");
		Assertions.assertInt(arena.getArea(0,0),1,"Error in testArea x 0 and y 0");

	}

}
