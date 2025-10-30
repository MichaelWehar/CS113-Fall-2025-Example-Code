public class ContinueAndBreak {
	public static void main(String[] args) {
		// Introducing break command
		// This is used to exit a loop
		String s = "bryn_mawr_college";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				break;
			}
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println();
		// Introducing continue command
		// This is used to skip an iteration
		int[] arr = {5, 3, 2, 8, 1, 6, 9, 7};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				continue;
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
