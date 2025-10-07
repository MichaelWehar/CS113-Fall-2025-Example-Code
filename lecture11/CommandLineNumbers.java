public class CommandLineNumbers {
	public static int getLargest(String[] tokens) {
		if(tokens.length > 0) {
			return getLargestHelper(0, tokens);
		} else {
			System.out.println("ERROR!");
			return -1;
		}
	}
	public static int getLargestHelper(int i, String[] tokens) {
		if(i < tokens.length - 1) {
			int current = Integer.parseInt(tokens[i]);
			int max = getLargestHelper(i + 1, tokens);
			if(current > max) {
				return current;
			} else {
				return max;
			}
		} else {
			// We have reached the end
			return Integer.parseInt(tokens[i]);
		}
	}
	public static int getSmallest(String[] tokens) {
		if(tokens.length > 0) {
			return getSmallestHelper(0, tokens);
		} else {
			System.out.println("ERROR!");
			return -1;
		}
	}
	public static int getSmallestHelper(int i, String[] tokens) {
		if(i < tokens.length - 1) {
			int current = Integer.parseInt(tokens[i]);
			int min = getSmallestHelper(i + 1, tokens);
			if(current < min) {
				return current;
			} else {
				return min;
			}
		} else {
			// We have reached the end
			return Integer.parseInt(tokens[i]);
		}
	}
	public static void main(String[] args) {
		// Alternatively, you could copy the values
		// from String[] args to an array of integers
		// int[] nums.  Then, you could pass an
		// array of integers into getLargest and
		// getSmallest.  See "CopyArray.java".
		System.out.println(getLargest(args));
		System.out.println(getSmallest(args));
	}
}
