public class Rectangle {
	public static final int maxHeight = 100;
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		// Use "this" to refer to the member variable
		// otherwise it chooses the local variable
		// over the member variable.
		this.width = width;
		this.height = Math.min(height, this.maxHeight);
	}
	// Static method
	public static Rectangle createSquare(int length) {
		// Creates a new Rectangle object where
		// width and height are the same.
		return new Rectangle(length, length);
		// Alternatively:
		// Rectangle temp = new Rectangle(length, length);
		// return temp;
	}
	// Getter methods
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	// Setter methods
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// toString method
	public String toString() {
		return "width = " + this.width + ", height = " + this.height;
	}
}
