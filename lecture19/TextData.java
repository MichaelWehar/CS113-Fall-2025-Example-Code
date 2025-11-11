public class TextData {
	public static void main(String[] args) {
		// Example of a CSV file record
		String record = "alice,567,20";
		// Using split to get its individual values
		String[] entries = record.split(",");
		String name = entries[0];
		String id = entries[1];
		String age = entries[2];
		// Printing the individual values
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
