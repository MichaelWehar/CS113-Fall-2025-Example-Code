public class ArraysExample {
	public static int sumOfValuesHelper(int i, int[] array) {
		if(i < array.length) {
			return array[i] + sumOfValuesHelper(i + 1, array);
		} else {
			return 0;
		}
	}
	public static int sumOfValues(int[] array) {
		return sumOfValuesHelper(0, array);
	}
	public static void main(String[] args) {
		// An array containing 4 values
		int[] x = {10, 15, 20, 25};
		// An array that can store 3 values
		int[] y = new int[3];
		// Reset values
		x[1] = 7;
		y[0] = 5;
		y[1] = 0;
		y[2] = 2;
		// Print the values
		System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3]);
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
		// Get the length of the array
		System.out.println(x.length);
		System.out.println(y.length);
		// Print sum recursively
		System.out.println("Sum: " + sumOfValues(x));
		System.out.println("Sum: " + sumOfValues(y));
	}
}
