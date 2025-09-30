public class IndexOf {
	public static int indexOfHelper(int i, char c, String s) {
		if(i < s.length()) {
			if(s.charAt(i) == c) {
				return i;
			} else {
				return indexOfHelper(i + 1, c, s);
			}
		} else {
			return -1;
		}
	}
	// Goal: return the index of the first
	// time the char appears in the string.
	// Return -1, if the char is not found.
	public static int indexOf(char c, String s) {
		return indexOfHelper(0, c, s);
	}
	public static void main(String[] args) {
		System.out.println(indexOf('a', "school"));
		System.out.println(indexOf('a', "apple"));
		System.out.println(indexOf('a', "bryn mawr"));
	}
}
