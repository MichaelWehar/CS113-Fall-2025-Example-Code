public class MethodHeaders {
	/*
	 * This takes in two numbers and adds them together.
	 * @param x is the first number
	 * @param y is the second number
	 * @return the sum value
	 */
	public static int addition(int x, int y) {
		return x + y;
	}
	/*
	 * Computes the distance between two points.
	 * @param x coordinate of first point
	 * @param y coordinate of first point
	 * @param x coordinate of second point
	 * @param y coordinate of second point
	 * @return the distance value
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	/*
	 * Outputs a sentence expressing a favorite flavor of a dessert.
	 * @param a favorite flavor
	 * @param a dessert
	 * @return the sentence value
	 */
	public static String favoriteFlavor(String flavor, String dessert) {
		return "My favorite flavor of " + dessert + " is " + flavor + ".";
	}
	/*
	 * Prints the name Bob.
	 */
	public static void printBob() {
		System.out.println("Bob");
	}
	public static void main(String[] args) {
		int result1 = addition(5, 7);
		double result2 = distance(1, 1, 4, 5);
		String result3 = favoriteFlavor("cookies n cream", "ice cream");
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
		System.out.println("Result 3: " + result3);
		// An example of a void method
		printBob();
		printBob();
		printBob();
	}
}
