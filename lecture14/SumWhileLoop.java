import java.util.Scanner;
public class SumWhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// While Loop
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Sum = " + sum);
	}
}
