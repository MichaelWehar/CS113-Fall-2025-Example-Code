public class StringExample {
	public static boolean containsDisPrefix(String x) {
		String lowerX = x.toLowerCase();
		if(lowerX.length() < 3) {
			return false;
		} else {
			if(lowerX.charAt(0) == 'd' && lowerX.charAt(1) == 'i' && lowerX.charAt(2) == 's') {
				return true;
			} else {
				return false;
			}
		}
	}
	public static boolean containsDisPrefix2(String x) {
		String lowerX = x.toLowerCase();
		if(lowerX.length() < 3) {
			return false;
		} else {
			String prefix = lowerX.substring(0, 3);
			// if(prefix.equals("dis")) {
			// 	return true;
			// } else {
			// 	return false;
			// }
			return prefix.equals("dis");
		}
	}
	public static void main(String[] args) {
		String word1 = "disapprove";
		String word2 = "computer";
		boolean result1 = containsDisPrefix2(word1);
		boolean result2 = containsDisPrefix2(word2);
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
	}
}
