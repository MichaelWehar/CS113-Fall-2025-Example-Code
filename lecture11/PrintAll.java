public class PrintAll {
	public static void printAllHelper(int i, String[] arr) {
		// Approach 1:
		if(i < arr.length) {
			System.out.println(arr[i]);
			printAllHelper(i + 1, arr);
		}
		// Approach 2:
		/*if(i >= arr.length) {
			return;
		}
		System.out.println(arr[i]);
		printAllHelper(i + 1, arr);*/
	}
	public static void printAll(String[] arr) {
		printAllHelper(0, arr);
	}
	public static void main(String[] args) {
		String[] arr = {"Bryn", "Mawr", "College"};
		printAll(arr);
		// Print commandline arguments
		printAll(args);
	}
}
