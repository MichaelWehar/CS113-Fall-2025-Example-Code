public class AssigningValues {
	public static void main(String[] args) {
		// Variable declaration and assignment
		int x = 10;
		int y = 5;
		// Reassign the value of x
		x = 4;
		// Print values
		System.out.println("x = " + x); // Concatenation
		System.out.println("y = " + y);
		// Let's reassign x's value again
		x = x + 5;
		y = y + 1;
		System.out.println("x = " + x);
        System.out.println("y = " + y);
		// Increment x and y
		x++;
		y++;
		System.out.println("x = " + x);
        System.out.println("y = " + y);
		// Combine assignment and operation
		y += 1; // instead you could have written y++;
		x += y;
		System.out.println("x = " + x);
        System.out.println("y = " + y);
	}
}
