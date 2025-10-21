public class NullValue {
	public static void main(String[] args) {
		bug1();
		// bug2();
	}
	public static void bug1() {
		String x = null;
		printLength(x);
		// fixedPrintLength(x);
	}
	// Bad
	public static void printLength(String s) {
		System.out.println(s.length());
	}
	// Good
	public static void fixedPrintLength(String s) {
		if(s != null) {
			System.out.println(s.length());
		} else {
			System.out.println("null");
		}
	}
	public static void bug2() {
		String x = null;
		String y = "apple";
		System.out.println(checkEquals(x, y));
		// System.out.println(fixedCheckEquals(x, y));
	}
	// Bad
	public static boolean checkEquals(String x, String y) {
		return x.equals(y);
	}
	// Good
	public static boolean fixedCheckEquals(String x, String y) {
		return (x == null && y == null) || (x != null && x.equals(y));
	}
}
