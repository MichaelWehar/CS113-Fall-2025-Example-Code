public class Main {
	public static void main(String[] args) {
		printError();
		printError("Index out of bounds.");
	}
	public static void printError() {
		System.out.println("An error occurred.");
	}
	public static void printError(String customMessage) {
		System.out.println("Error: " + customMessage);
	}
}
