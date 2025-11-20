import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class IncreaseArray {
	public static int[] appendToArray(int[] arr, int n) {
		int len = arr.length;
		// Create a new array that has size (len + 1)
		int[] newArr = new int[len + 1];
		// Copy over the old array elements to the new array
		for(int i = 0; i < len; i++) {
			newArr[i] = arr[i];
		}
		// Place the new value at the end of the array
		newArr[len] = n;
		// Return the new array
		return newArr;
	}
	public static void main(String[] args) {
		try{
			int[] numbers = new int[0];
			File f = new File("numbers.txt");
			Scanner s = new Scanner(f);
			while(s.hasNext()) {
				int n = s.nextInt();
				numbers = appendToArray(numbers, n);
			}
			// Test that the array was populated correctly
			System.out.println(Arrays.toString(numbers));
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}
