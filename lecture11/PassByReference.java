import java.util.Arrays;

public class PassByReference {
	public static void modifyFirstElement(int[] arr) {
		if(arr.length > 0) {
			arr[0] = 1000;
		}
	}
	public static void modifyInt(int x) {
		x = 77;
	}
	public static void main(String[] args) {
		int x = 5;
		int[] arr = {5, 10, 15};
		System.out.println(x);
		System.out.println(Arrays.toString(arr));
		modifyInt(x);
		modifyFirstElement(arr);
		System.out.println(x);
		System.out.println(Arrays.toString(arr));
	}
}
