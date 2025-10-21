public class AnotherArrayCopy {
	public static void main(String[] args) {
		int[] x = {5, 2, 7};
		int[] y = copy(x);
		System.out.println("Before:");
		System.out.println(x[0] + ", " + x[1] + ", " + x[2]);
		System.out.println(y[0] + ", " + y[1] + ", " + y[2]);
		x[1] = 0;
		y[2] = 9;
		System.out.println("After:");
		System.out.println(x[0] + ", " + x[1] + ", " + x[2]);
		System.out.println(y[0] + ", " + y[1] + ", " + y[2]);
	}
	public static int[] copy(int[] oldArr) {
		int len = oldArr.length;
		int[] newArr = new int[len];
		copyValues(0, oldArr, newArr);
		return newArr;
	}
	public static void copyValues(int i, int[] oldArr, int[] newArr) {
		if(i < oldArr.length) {
			newArr[i] = oldArr[i];
			copyValues(i + 1, oldArr, newArr);
		}
	}
}
