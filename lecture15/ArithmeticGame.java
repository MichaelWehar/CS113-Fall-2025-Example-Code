import java.util.Scanner;
public class ArithmeticGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = (int)(20 * Math.random());
		int y = (int)(20 * Math.random());
		System.out.println(x + " x " + y + " = ?");
		int guess = s.nextInt();
		while(x * y != guess) {
			System.out.println("Try Again!");
			guess = s.nextInt();
		}
		System.out.println("Correct!");
	}
}
