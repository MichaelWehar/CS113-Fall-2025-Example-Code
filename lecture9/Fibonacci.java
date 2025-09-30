public class Fibonacci {
	public static int fib(int n) {
		// System.out.println("Called on input: " + n);
		if(n > 1) {
			return fib(n - 1) + fib(n - 2);
		} else if(n == 1) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// System.out.println(fib(0));
		// System.out.println(fib(1));
		// System.out.println(fib(9));
		System.out.println("Result = " + fib(4));
	}
}
