public class Board {
  // Member Variables
  public int treasureX;
  public int treasureY;
  public int width;
  public int height;
  // Constructor
  public Board(int w, int h) {
	width = w;
	height = h;
	setRandomPosition();
  }
  // Methods
  public void setRandomPosition() {
    treasureX = (int)(width * Math.random());
	treasureY = (int)(height * Math.random());
  }
  public int guessPosition(int x, int y) {
    if(x >= 0 && x < width && y >= 0 && y < height) {
		int dx = Math.abs(treasureX - x);
		int dy = Math.abs(treasureY - y);
		return dx + dy;
	} else {
		return -1;
	}
  }
}
