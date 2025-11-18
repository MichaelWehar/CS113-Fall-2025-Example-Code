public class Equals {
	public static void main(String[] args) {
		DrawableRectangle rect1 = new DrawableRectangle(2, 5, '#');
		DrawableRectangle rect2 = new DrawableRectangle(2, 5, '#');
		System.out.println(rect1 == rect2);
		System.out.println(rect1.equals(rect2));
	}
}
