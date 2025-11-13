public class Main {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(3, 5);
		Rectangle rect2 = new Rectangle(2, 7);
		// Can't do this unless width is public
		// within the Rectangle class.
		// rect1.width = 8;
		// Instead, if width is private, we must
		// do the following.
		rect1.setWidth(8);
		System.out.println(rect1.toString());
		// Using static resources
		Rectangle rect3 = Rectangle.createSquare(3);
		System.out.println(rect3.toString());
		System.out.println(Rectangle.maxHeight);
		// Testing final variable
		// This doesn't work because we cannot
		// reset the value of a constant:
		// Rectangle.maxHeight = 5;
		Rectangle rect4 = new Rectangle(512, 256);
		System.out.println(rect4.toString());
	}
}
