public class DrawableRectangle {
	private int width;
	private int height;
	private char fillChar;
	public DrawableRectangle(int width, int height, char fillChar) {
		this.width = width;
		this.height = height;
		this.fillChar = fillChar;
	}
	// Getters
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public char getFillChar() {
		return this.fillChar;
	}
	// Setters
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setFillChar(char fillChar) {
		this.fillChar = fillChar;
	}
	// Additional Methods
	public void draw() {
		for(int i = 0; i < this.height; i++) {
			for(int j = 0; j < this.width; j++) {
				System.out.print(this.fillChar);
			}
			System.out.println();
		}
	}
	public String toString() {
		return this.height + " by " + this.width + " with char '" + fillChar + "'";
	}
	public boolean equals(DrawableRectangle other) {
		return other != null && this.width == other.getWidth() && this.height == other.getHeight() && this.fillChar == other.getFillChar();
	}
}
