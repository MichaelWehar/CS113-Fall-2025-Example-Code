import java.util.Arrays;

public class AnotherStackDiagram {
	public static void maxAndMinHelper(int i, int max, int min, int[] arr) {
		if(i < arr.length) {
			if(arr[i] > max) {
				arr[i] = max;
			} else if(arr[i] < min) {
				arr[i] = min;
			}
			maxAndMinHelper(i + 1, max, min, arr);
		}
	}
	public static void maxAndMin(int max, int min, int[] arr) {
		maxAndMinHelper(0, max, min, arr);
	}
	public static void main(String[] args) {
		int[] a = {-2, -3, 1, 7, 10};
		maxAndMin(5, 0, a);
		System.out.println(Arrays.toString(a));
	}
}
