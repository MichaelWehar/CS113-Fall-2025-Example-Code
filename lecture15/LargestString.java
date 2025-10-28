public class LargestString {
	public static void main(String[] args) {
		String result = largest(args);
		System.out.println("A largest string is: " + result);
	}
	public static String largest(String[] words) {
		if(words.length > 0) {
			String largest = words[0];
			int i = 1;
			while(i < words.length) {
				if(largest.length() < words[i].length()) {
					largest = words[i];
				}
				i++;
			}
			return largest;
		} else {
			return null;
		}
	}
}
