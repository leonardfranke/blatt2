package blatt2;

public class Assertions {

	private static int errors;

	public static void assertStringRef(String str1, String str2, String errorMsg) {
		if(str1 == str2) {
			System.out.println(errorMsg);
			errors++;
		}
	}

	public static void assertInt(int int1, int int2, String errorMsg) {
		if(int1 != int2) {
			System.out.println(errorMsg);
			errors++;
		}
	}

	public static int getErrors() {
		return errors;
	}
}
