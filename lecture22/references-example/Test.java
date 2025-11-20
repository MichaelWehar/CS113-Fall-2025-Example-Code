public class Test {
  public static void main(String[] args) {
    Fruit a = new Fruit("Apple");
    Fruit b = new Fruit("Banana");
    Fruit c = new Fruit("Cherry");
    System.out.println("VALUES:");
    System.out.println("\ta is " + a.getType());
    System.out.println("\tb is " + b.getType());
    System.out.println("\tc is " + c.getType());

    a = b;
    b.setType("Grape");
    System.out.println("VALUES:");
    System.out.println("\ta is " + a.getType());
    System.out.println("\tb is " + b.getType());
    System.out.println("\tc is " + c.getType());

    a = new Fruit("Orange");
    c = b;
    c.setType("Kiwi");
    System.out.println("VALUES:");
    System.out.println("\ta is " + a.getType());
    System.out.println("\tb is " + b.getType());
    System.out.println("\tc is " + c.getType());
  }
}
