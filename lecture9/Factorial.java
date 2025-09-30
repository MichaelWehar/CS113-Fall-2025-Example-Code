public class Factorial {
	public static int factorial(int n) {
		System.out.println("Started call on input: " + n);
		if(n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(4));
		System.out.println(factorial(7));
	}
}
