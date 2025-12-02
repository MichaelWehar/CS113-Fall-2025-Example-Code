public class Rectangle implements Drawable, Comparable<Rectangle> {
  private int width;
  private int height;
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public int computeArea() {
    return this.width * this.height;
  }
  public int compareTo(Rectangle other) {
    return this.computeArea() - other.computeArea();
  }
  public void draw(String symbol) {
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        System.out.print(symbol);
      }
      System.out.println();
    }
  }
}
