public class References {
	public static void main(String[] args) {
		// Primitive Data
		int a = 5;
		int b = 7;
		System.out.println(a + ", " + b);
		// Variable Assignment
		a = b;
		b = 2;
		System.out.println(a + ", " + b);
		// Objects
		DrawableRectangle rect1 = new DrawableRectangle(3, 4, 'o');
		DrawableRectangle rect2 = new DrawableRectangle(6, 1, 'x');
		System.out.println(rect1.toString() + " | " + rect2.toString());
		// Variable Assignment
		rect1 = rect2;
		rect2.setWidth(25);
		System.out.println(rect1.toString() + " | " + rect2.toString());
	}
}
