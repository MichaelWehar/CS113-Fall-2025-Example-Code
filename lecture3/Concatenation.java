public class Concatenation {
	public static void main(String[] args) {
		String x = "123";
		// Can't do this int y = "456";
		int y = 456;
		System.out.println(x + y);
		// What if we want to convert x to a numeric value?
		int z = Integer.parseInt(x);
		System.out.println(z + y);
		// Converting int to a String
		String s = String.valueOf(y);
		System.out.println(s + " = " + y);
		// Convert double to int
		double a = 5.55;
		int b = (int) a; // This is called casting
		System.out.println(a);
		System.out.println(b);
	}
}
