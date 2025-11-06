public class Main {
	public static void main(String[] args) {
		ReadFromFile r = new ReadFromFile();
		System.out.println(r.getWidth("test.txt"));
		System.out.println(r.getWidth("ghost.txt"));
		// Alternatively, you can still use
		// these methods without defining a
		// ReadFromFile variable.
		System.out.println(ReadFromFile.getWidth("test.txt"));
	}
}
