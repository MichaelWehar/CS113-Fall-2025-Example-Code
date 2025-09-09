public class CodeReadability {
	public static void main(String[] args) {
		// This is where you put your code
		System.out.println("Hello World!");
		System.out.println("abc");
		System.out.println();
		System.out.println("x\ny\nz");
	}
}

/*
Bad - Does not use proper indentation
public class CodeReadability {
public static void main(String[] args) {
// This is where you put your code
System.out.println("Hello World!");
}
}
*/

/*
Bad - You typically shouldn't break up a single
into multiple lines
public class CodeReadability {
	public static void main(String[] args) {
		// This is where you put your code
		System
		.
		out
		.
		println("Hello World!");
	}
}
*/
