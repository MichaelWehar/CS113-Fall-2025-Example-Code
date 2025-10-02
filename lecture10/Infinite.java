public class Infinite {
	public static void printX(int n) {
		if(n > 0) {
			System.out.print("x");
			printX(n - 1);
		} else {
			System.out.println();
		}
	}
	public static void recursivePrint(int max, int n, int inc) {
		printX(n);
		n += inc;
		if(n <= 0 || n >= max) {
			inc *= -1;
		}
		recursivePrint(max, n, inc);
	}
	public static void badRecursion(int n) {
		badRecursion(n + 1);
	}
	public static void main(String[] args) {
		// badRecursion(0);
		recursivePrint(30, 0, 1);
	}
}
