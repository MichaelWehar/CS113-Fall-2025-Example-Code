import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {
	public static int getNumOfRecords() {
		try{
			// Opens the file for reading
			String filename = "rectangles.csv";
			File f = new File(filename);
			Scanner s = new Scanner(f);
			// Create counter
			int count = 0;
			// Read the file line by line
			while(s.hasNext()) {
				s.nextLine();
				count++;
			}
			return count;
		} catch(FileNotFoundException e) {
			return -1;
		}
	}
	public static DrawableRectangle createRectFromRecord(String record) {
		String[] values = record.split(",");
		int width = Integer.parseInt(values[0]);
		int height = Integer.parseInt(values[1]);
		char fillChar = values[2].charAt(0);
		return new DrawableRectangle(width, height, fillChar);
	}
	public static void main(String[] args) {
		// Creating the array of rectangles
		int len = getNumOfRecords();
		DrawableRectangle[] rects = new DrawableRectangle[len];
		// Populating our array with rectangles
		try{
			// Opens the file for reading
			String filename = "rectangles.csv";
			File f = new File(filename);
			Scanner s = new Scanner(f);
			// Array index
			int i = 0;
			// Read the file line by line
			while(s.hasNext()) {
				String line = s.nextLine();
				rects[i] = createRectFromRecord(line);
				i++;
			}
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		// Print and draw all of the rectangles
		for(DrawableRectangle r : rects) {
			System.out.println(r.toString());
			r.draw();
		}
	}
}
