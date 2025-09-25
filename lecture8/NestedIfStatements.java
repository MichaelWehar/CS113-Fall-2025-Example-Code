public class NestedIfStatements {
	/*
	 * To be a sentence, it must be at least 5
	 * chars long, start with a capital letter,
	 * and end with '.', '?', or '!'.
	 * @param a string
	 * @return true if the string is a sentence,
	 * false otherwise.
	 */
	public static boolean isASentence(String s) {
		if(s.length() >= 5) {
			String firstChar = s.substring(0, 1);
			if(firstChar.toUpperCase().equals(firstChar)) {
				int length = s.length();
				String lastChar = s.substring(length - 1, length);
				if(lastChar.equals(".") || lastChar.equals("?") || lastChar.equals("!")) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public static boolean isASentenceAlternative(String s) {
		// Try it out and we will discuss next time
		return false;
	}
	public static void main(String[] args) {
		String a = "This is a test";
		String b = "What about this?";
		String c = "and could this be!";
		String d = "Hi!";
		System.out.println(isASentence(a));
		System.out.println(isASentence(b));
		System.out.println(isASentence(c));
		System.out.println(isASentence(d));
	}
}
