public class Lab5 {
	public static void printNumsHelper(int i, int x, int y, int n) {
		if(i % x != 0 && i % y != 0) {
			System.out.println(i);
		}
		if(i <= n) {
			printNumsHelper(i + 1, x, y, n);
		}
	}
	public static void printNums(int x, int y, int n) {
		printNumsHelper(0, x, y, n);
	}
	public static String replaceCharsHelper(int i, String s, char c1, char c2) {
		if(i < s.length()) {
			if(s.charAt(i) == c1) {
				return replaceCharsHelper(i + 1, s.substring(0, i) + c2 + s.substring(i + 1), c1, c2);
			} else {
				return replaceCharsHelper(i + 1, s, c1, c2);
			}
		} else {
			return s;
		}
	}
	public static String replaceChars(String s, char c1, char c2) {
		return replaceCharsHelper(0, s, c1, c2);
	}
	public static void main(String[] args) {
		printNums(3, 4, 20);
		System.out.println(replaceChars("book", 'o', '0'));
	}
}
