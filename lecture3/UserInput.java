// JavaDoc: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		// Sets up user input
		Scanner in = new Scanner(System.in);
		// Prompt the user for input
		System.out.println("Enter a string below: ");
		String s = in.nextLine();
		// Print what the user typed
		System.out.println("You typed: " + s);
		// Prompt the user for an int
		System.out.println("Enter a number of years: ");
		int x = in.nextInt();
		System.out.println("That is equal to " + (365 * x) + " days.");
		// Prompt the user for a double
		System.out.println("Enter a distance in miles: ");
		double y = in.nextDouble();
		// Print what the user typed
		System.out.println("The user entered " + y + " miles.");
		System.out.println("That is equal to " + (1.609 * y) + " kilometers.");
	}
}
