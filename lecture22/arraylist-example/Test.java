import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		try{
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			File f = new File("numbers.txt");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				int n = s.nextInt();
				numbers.add(n);
			}
			// Test that the array was populated correctly
			System.out.println(numbers.toString());
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
