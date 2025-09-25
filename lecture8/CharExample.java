public class CharExample {
	public static void main(String[] args) {
		// char's just store a numerical value
		char x = 97;
		char y = 'a';
		System.out.println("x is the char: " + x);
		System.out.println("y is the char: " + y);
		if(x == y) {
			System.out.println("x and y are equals!");
		}
		// You can compare chars!
		if('b' < 'e') {
			System.out.println("'b' is less than 'e'.");
		}
		// You can get single chars from Strings
		String s = "Hello World!";
		System.out.println(s.charAt(1) + "" + s.charAt(2) + "" + s.charAt(3) + "" + s.charAt(4));
		// Same as this!
		System.out.println(s.substring(1, 5));
	}
}
