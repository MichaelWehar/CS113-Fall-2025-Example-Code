import java.util.Arrays;

public class IncrementAllValues {
	public static void incrementAllHelper(int i, int[] arr) {
		if(i < arr.length) {
			arr[i]++;
			incrementAllHelper(i + 1, arr);
		}
	}
	public static void incrementAll(int[] arr) {
		incrementAllHelper(0, arr);
	}
	public static void main(String[] args) {
		int[] a = {3, 4, 6};
		int[] b = {10, 9, 8, 7, 0};
		int[] c = {5};
		int[] d = {};
		incrementAll(a);
		incrementAll(b);
		incrementAll(c);
		incrementAll(d);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
}
