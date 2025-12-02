public class Main {
	public static void main(String[] args) {
		test1();
		test2();
	}
	public static void test1() {
	  // Create rectangles
	  Rectangle a = new Rectangle(7, 10);
	  Rectangle b = new Rectangle(5, 4);
	  // Draw rectangles
	  a.draw("A");
	  b.draw("B");
	  // Compare rectangles
	  if(a.compareTo(b) > 0) {
	    System.out.println("a is larger than b");
	  } else if(a.compareTo(b) < 0) {
	    System.out.println("a is smaller than b");
	  } else {
	    System.out.println("a and b have the same size");
	  }
	}
	public static void test2() {
	  // Polymorphism
	  Drawable c = new Rectangle(3, 2);
	  Drawable d = new Rectangle(4, 1);
	  c.draw("C");
	  d.draw("D");
	  // Cannot do this
	  // if(c.compareTo(d) < 0) {
	  //   System.out.println("c is smaller than d");
	  // }
	}
}
