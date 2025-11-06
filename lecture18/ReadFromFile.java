import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	public static boolean fileExists(String filename) {
		File f = new File(filename);
		return f.exists();
	}
	public static int getWidth(String filename) {
		try {
			Scanner s = new Scanner(new File(filename));
			String line = s.nextLine();
			return line.length();
		} catch(FileNotFoundException e) {
			return -1;
		}
	}
	public static int getHeight(String filename) {
		try {
			Scanner s = new Scanner(new File(filename));
			String line;
			int count = 0;
			while(s.hasNextLine()) {
				line = s.nextLine();
				count++;
			}
			return count;
		} catch(FileNotFoundException e) {
			return -1;
		}
	}
	public static char[][] get2DArray(String filename) {
		try {
			int width = getWidth(filename);
			int height = getHeight(filename);
			char[][] table = new char[height][width];
			Scanner s = new Scanner(new File(filename));
			for(int i = 0; i < height; i++) {
				String line = s.nextLine();
				for(int j = 0; j < width; j++) {
					table[i][j] = line.charAt(j);
				}
			}
			return table;
		} catch(FileNotFoundException e) {
			return null;
		}
	}
	public static void main(String[] args) {
		// Test 1
		if(fileExists("test.txt")) {
			System.out.println("The file exists!");
		}
		// Test 2
		System.out.println(getWidth("test.txt"));
		System.out.println(getHeight("test.txt"));
		// Test 3
		char[][] table = get2DArray("test.txt");
		int rows = table.length;
		int cols = table[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
}
