public class StringArrayExample {
	public static int combinedLengthHelper(int i, String[] words) {
		if(i < words.length) {
			return words[i].length() + combinedLengthHelper(i + 1, words);
		} else {
			return 0;
		}
	}
	// Computes the sum of the lengths of all of the strings
	public static int combinedLength(String[] words) {
		return combinedLengthHelper(0, words);
	}
	public static void main(String[] args) {
		String[] fruit = {"apple", "orange", "grape", "plum"};
		System.out.println(combinedLength(fruit));
	}
}
