import java.util.Scanner;
public class FactorialAgain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(whileFactorial(n));
		System.out.println(forFactorial(n));
	}
	public static int whileFactorial(int n) {
		int result = 1;
		int i = 1;
		while(i <= n) {
			result *= i;
			i++;
		}
		return result;
	}
	public static int forFactorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
