public class InfiniteLoops {
	public static void main(String[] args) {
		// Simplest infinite loop
		while(true) {
			// do nothing
		}
		// Condition is never false
		int x = 10;
		while(x > 0) {
			x = (x + 1) / 2;
		}
	}
}
