public class Test {

  public static void main(String[] args) {
    String x = "hello world";
    String y = "HELlo worLD";
    checkEquals(x, x);
    checkEquals(x, y);
    y = y.toLowerCase();
    checkEquals(x, y);
  }

  public static void checkEquals(String x, String y) {
    if(x == y) {
      System.out.println("Refer to same memory location.");
    } else if(x.equals(y)) {
      System.out.println("Refer to equivalent data.");
    } else {
      System.out.println("Neither.");
    }
  }

}
