import java.util.Scanner;

public class UserInputs2 {
	public static void main(String[] args) {
		// Open the scanner
		Scanner in = new Scanner(System.in);
		// Read in two ints
		System.out.println("Enter width: ");
		int width = in.nextInt();
		System.out.println("Enter height: ");
		int height = in.nextInt();
		// Now, let's compute the slope
		double slope = ((double) height) / width;
		System.out.printf("The slope is: %.2f\n", slope);
		// Close the scanner
		in.close();
	}
}
