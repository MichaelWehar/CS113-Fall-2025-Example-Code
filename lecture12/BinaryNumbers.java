public class BinaryNumbers {
	// The helper method is needed just so that
	// n = 0 returns "0" instead of "".
	public static String inBinaryHelper(int n) {
		if(n > 0) {
			// String concatenation
			return inBinaryHelper(n / 2) + (n % 2);
		} else {
			return "";
		}
	}
	public static String inBinary(int n) {
		if(n > 0) {
			return inBinaryHelper(n);
		} else if(n == 0) {
			return "0";
		} else {
			return "Negative Numbers Are Not Supported!";
		}
	}
	public static void main(String[] args) {
		int x = 13;
		int y = 22;
		int z = 32;
		System.out.println(x + " = " + inBinary(x));
		System.out.println(y + " = " + inBinary(y));
		System.out.println(z + " = " + inBinary(z));
	}
}
