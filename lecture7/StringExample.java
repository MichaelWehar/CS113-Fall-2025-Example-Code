public class StringExample {
	public static boolean containsDisPrefix(String x) {
		if(x.length() < 3) {
			return false;
		} else {
			if(x.charAt(0) == 'd' && x.charAt(1) == 'i' && x.charAt(2) == 's') {
				return true;
			} else {
				return false;
			}
		}
	}
	public static void main(String[] args) {
		String word1 = "disapprove";
		String word2 = "computer";
		boolean result1 = containsDisPrefix(word1);
		boolean result2 = containsDisPrefix(word2);
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
	}
}
