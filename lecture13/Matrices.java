public class Matrices {
	public static void main(String[] args) {
		// This is how you create a new 2D array in Java
		// The variable x will store 3 arrays each of
		// length 2.
		int[][] x = new int[3][2];
		// Setting each array within x
		x[0] = new int[]{5, 7};
		x[1] = new int[]{8, 4};
		x[2] = new int[]{1, 3};
		// Alternatively:
		// x[0][0] = 5;
		// x[0][1] = 7;
		// x[1][0] = 8;
		// x[1][1] = 4;
		// x[2][0] = 1;
		// x[2][1] = 3;
		// Element lookup
		System.out.println(x[0][1]);
		System.out.println(x[2][0]);
		// Print all elements
		printMatrix(x);
	}
	public static void printMatrix(int[][] x) {
		int rows = x.length;
		if(rows > 0) {
			int cols = x[0].length;
			printMatrixHelper(0, 0, rows, cols, x);
		}
	}
	public static void printMatrixHelper(int i, int j, int m, int n, int[][] x) {
		if(i < m && j < n) {
			System.out.print(x[i][j] + " ");
			printMatrixHelper(i, j + 1, m, n, x);
		} else if(i < m && j == n) {
			System.out.println();
			printMatrixHelper(i + 1, 0, m, n, x);
		}
	}
}
