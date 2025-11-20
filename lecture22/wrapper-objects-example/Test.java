public class Test {
  public static void main(String[] args) {
    Integer x = 18;
    Integer y = new Integer(32);
    // Performs integer addition
    System.out.println(x + y);
    // Performs string concatenation
    System.out.println(x.toString() + y.toString());

    int z = 84;
    // The following would not work!
    //System.out.println(x.toString() + z.toString());
    // This does work though!
    System.out.println(x.toString() + z);
  }
}
