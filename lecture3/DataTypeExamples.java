public class DataTypeExamples {
	public static void main(String[] args) {
		// This performs int division because
		// Java interprets both 1 and 3 to be
		// int values.
		double x = 1 / 3;
		System.out.println(x);
		// This performs double division
		// because Java sees that 3.0 is a
		// double value.
		double y = 1 / 3.0;
		System.out.println(y);
		// Other ways to print values
		// You can use printf (format)
		System.out.printf("y rounded down to two decimal places = %.2f\n", y);
		System.out.printf("%.3f", y);
		System.out.println();
		// Let's try multiple variables
		System.out.printf("x = %f and y = %f\n", x, y);
	}
}
