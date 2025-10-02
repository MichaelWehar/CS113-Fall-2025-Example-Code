public class PassByValue {
	public static void methodB(int z) {
		System.out.println("methodB: z = " + z);
		z = 1;
		System.out.println("methodB: z = " + z);
	}
	public static void methodA(int x, int y) {
		System.out.println("methodA: x = " + x);
		System.out.println("methodA: y = " + y);
		methodB(x);
		System.out.println("methodA: x = " + x);
		System.out.println("methodA: y = " + y);
		x++;
		y = 3;
		System.out.println("methodA: x = " + x);
		System.out.println("methodA: y = " + y);
	}
	public static void main(String[] args) {
		int n = 7;
		int m = 24;
		System.out.println("main: n = " + n);
		System.out.println("main: m = " + m);
		methodA(n, m);
		System.out.println("main: n = " + n);
		System.out.println("main: m = " + m);
	}
}
