public class RandomNumbers {
	public static void main(String[] args) {
		// Random double from 0 to 1 (excluding 1)
		double x = Math.random();
		// Random int from 0 to 10 (excluding 10)
		int y = (int)(10 * Math.random());
		// Random int from 3 to 8 (excluding 8)
		int z = (int)(3 + 5 * Math.random());
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
