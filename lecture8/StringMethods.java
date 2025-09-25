public class StringMethods {
	public static void main(String[] args) {
		String x = "BrYN MaWR COLLEge";
		// Basic String Methods
		System.out.println("Length : " + x.length());
		System.out.println("Char at index 3 : " + x.charAt(3));
		System.out.println("Lowercase : " + x.toLowerCase());
		System.out.println("Where is 1st 'L' : " + x.indexOf("L"));
		System.out.println("Contains oll? : " + x.contains("oll"));
		System.out.println("Substring 1 : " + x.substring(0, 4));
		System.out.println("Substring 2 : " + x.substring(5, 9));
		// Chaining together method calls
		System.out.println("Contains oll? : " + x.toLowerCase().contains("oll"));
	}
}
