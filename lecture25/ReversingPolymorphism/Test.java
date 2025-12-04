public class Test {
  public static void main(String[] args) {
    Doctor charlie = new Cardiologist(); // This is polymorphism
    System.out.println(charlie.getDegreeType()); // MD
    System.out.println(charlie.getJobTitle()); // Cardiologist
    if(charlie instanceof Cardiologist) {
		Cardiologist charlie2 = (Cardiologist) charlie;
		charlie2.checkHeart();
	} else {
		System.out.println("Charlie is not a Cardiologist!");
	}
  }
}
