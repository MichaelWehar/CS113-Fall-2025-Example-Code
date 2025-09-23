public class Booleans {
	public static void main(String[] args) {
		// Testing booleans and relational operators
		boolean a = true;
		boolean b = 10 < 15;
		int x = 5;
		int y = 7;
		boolean c = x + 1 > y;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		// Testing logical operators
		boolean d = a && b && c;
		boolean e = a && b && !c;
		boolean f = !a || c;
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		// Testing if statements
		if(c) {
		  System.out.println("CASE 1");
		} else if(!a) {
		  System.out.println("CASE 2");
		} else {
		  System.out.println("CASE 3");
		}
		if(x < 6 && e) {
		  System.out.println("It worked!");
		}
	}
}
