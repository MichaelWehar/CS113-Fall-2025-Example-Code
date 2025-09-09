public class Operations {
	public static void main(String[] args) {
		// Our first variable
		int x = 5;
		System.out.println(x);
		// Our second variable
		int y = 7;
		System.out.println(x + y);
		// Our third variable
		double z = 7;
		// More operator examples
		System.out.println(x / y);
		System.out.println(x / z);
		System.out.println(x % y); // modulus
		System.out.println(y % x);
		// Let's try out order of operations
		System.out.println(x + y * y);
		System.out.println((x + y) * y);
	}
}
