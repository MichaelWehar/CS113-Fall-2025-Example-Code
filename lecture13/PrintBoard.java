public class PrintBoard {
	public static void printBoardHelper(int i, int j, int m, int n) {
		if(i < m && j < n) {
			System.out.print("X");
			printBoardHelper(i, j + 1, m, n);
		} else if(j == n && i < m) {
			System.out.println();
			printBoardHelper(i + 1, 0, m, n);
		}
	}
	public static void printBoard(int m, int n) {
		printBoardHelper(0, 0, m, n);
	}
	public static void main(String[] args) {
		printBoard(5, 7);
		printBoard(10, 15);
		printBoard(20, 20);
	}
}
