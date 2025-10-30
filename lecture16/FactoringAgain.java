public class FactoringAgain {
	public static void main(String[] args) {
		// Missing command line argument
		if(args.length != 1) {
			System.out.println("Command line argument is missing");
			return;
		}
		// Check if the input can be factored
		int n = Integer.parseInt(args[0]);
		for(int i = 2; i <= n / 2; i++) {
			for(int j = i; j <= n / 2; j++) {
				System.out.println("CASE: " + i + " " + j);
				if(n == i  * j) {
					// Exit if factors are found
					System.out.println(n + " = " + i + " x " + j);
					return;
				}
			}
		}
		// Otherwise it's prime or less than 2
		if(n > 1) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is less than 2");
		}
	}
}
