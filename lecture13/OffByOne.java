public class OffByOne {
	public static void main(String[] args) {
		// bug1();
		// bug2(19);
		bug3();
	}
	public static void bug1() {
		String name = "Bryn Mawr College";
		int len = name.length();
		// Should print the last char, but fails.
		System.out.println(name.charAt(len));
	}
	public static void bug2(int n) {
		if(n == 1) {
			System.out.println("Finished!");
		} else {
			bug2(n / 3);
		}
	}
	public static void bug3() {
		int[] arr = new int[3];
		arr[0] = 54;
		arr[1] = 32;
		arr[2] = 18;
		arr[3] = 20;
		System.out.println(arr[0]);
	}
}
