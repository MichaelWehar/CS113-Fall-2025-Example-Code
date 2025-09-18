public class ChainOfMethods {
	// Three Actions
	public static void openAction(String x) {
		System.out.println("Open " + x);
	}
	public static void closeAction(String x) {
		System.out.println("Close " + x);
	}
	public static void pourAction(String x) {
		openAction(x);
		System.out.println("Pour " + x);
		closeAction(x);
	}

	// Perform actions on Refridgerator
	public static void openRefridgerator() {
		openAction("Refridgerator");
	}
	public static void closeRefridgerator() {
		closeAction("Refridgerator");
	}

	// Perform action on Milk
	public static void pourMilk() {
		pourAction("Milk");
	}

	// Combined action
	public static void getAGlassOfMilk() {
		openRefridgerator();
		pourMilk();
		closeRefridgerator();
	}

	// Runs code
	public static void main(String[] args) {
		getAGlassOfMilk();
	}
}
