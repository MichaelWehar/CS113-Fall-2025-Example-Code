import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class ReadFile {
	public static void main(String[] args) {
		try{
			// Opens the file for reading
			String filename = "words2.txt";
			File f = new File(filename);
			Scanner s = new Scanner(f);
			// Creates a Map with Strings as keys
			// and Integers as values
			Map<String, Integer> wordCount = new HashMap<String, Integer>();
			// Read the file line by line
			while(s.hasNext()) {
				String key = s.nextLine().toLowerCase();
				if(wordCount.containsKey(key)) {
					Integer value = wordCount.get(key);
					wordCount.replace(key, value + 1);
				} else {
					wordCount.put(key, 1);
				}
			}
			// Print all of the key-value pairs
			Set<String> keys = wordCount.keySet();
			for(String key : keys) {
				Integer value = wordCount.get(key);
				System.out.println(key + ", " + value);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
