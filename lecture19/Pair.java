public class Pair {
	// Member variables
	public int x;
	public int y;
	// Constructor
	public Pair(int a, int b) {
		x = a;
		y = b;
	}
	// Getter Methods
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// Setter Methods
	public void setX(int newX) {
		x = newX;
	}
	public void setY(int newY) {
		y = newY;
	}
	// More methods
	public String toString() {
		return "x : " + x + ", y : " + y;
	}
	public boolean equals(Pair other) {
		return x == other.getX() && y == other.getY();
	}
}
