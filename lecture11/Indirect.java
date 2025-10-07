public class Indirect {
	public static void subtractThree(int n) {
		if(n > 2) {
			n -= 3;
			System.out.println("Subracted Three: " + n);
			addOne(n);
		}
	}
	public static void addOne(int n) {
		n++;
		System.out.println("Added One: " + n);
		subtractThree(n);
	}
	public static void main(String[] args) {
		int n = 10;
		addOne(n);
	}
}
