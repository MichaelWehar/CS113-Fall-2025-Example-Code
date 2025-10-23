public class PrintAllAgain {
	public static void main(String[] args) {
		int[] x = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		recursivePrint(x, 0);
		whilePrint(x);
		forPrint(x);
		forEachPrint(x);
	}
	public static void recursivePrint(int[] x, int i) {
		if(i < x.length) {
			System.out.print(x[i] + " ");
			recursivePrint(x, i + 1);
		} else {
			System.out.println();
		}
	}
	public static void whilePrint(int[] x) {
		int i = 0;
		while(i < x.length) {
			System.out.print(x[i] + " ");
			i++;
		}
		System.out.println();
	}
	public static void forPrint(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	public static void forEachPrint(int[] x) {
		for(int element : x) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
