public class StringComparison {
	public static void main(String[] args) {
		String x = "apple";
		String y = "orange";
		String z = "AppLE ";
		// equals
		if(x.equals(y)) {
			System.out.println("x and y are equal.");
		} else if(x.equals(z)) {
			System.out.println("x and z are equal.");
		} else if(x.equals(z.toLowerCase())) {
			System.out.println("x and z.toLowerCase() are equal.");
		} else if(x.equals(z.toLowerCase().trim())) {
			System.out.println("x and z are equal if you make z lowercase and trim leading / trailing spaces.");
		} else {
			System.out.println("None of them are equal.");
		}
		// compareTo
		if(x.compareTo(y) < 0) {
			System.out.println("x comes before y.");
		}
		if(y.compareTo(z) < 0) {
			System.out.println("y comes before z.");
		}
		if(x.compareTo(z) < 0) {
			System.out.println("x comes before z.");
		} else if(x.compareTo(z) > 0) {
			System.out.println("x comes after z.");
		}
		if(x.compareTo(z.toLowerCase().trim()) == 0) {
			System.out.println("x and z are equal if you make z lowercase and trim leading / trailing spaces.");
		}
		// Extra test case
		System.out.println(x.compareTo("apples") < 0);
	}
}

