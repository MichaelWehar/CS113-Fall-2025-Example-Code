import java.util.Arrays;

public class CopyArray {
	public static void copyValuesHelper(int i, String[] words, int[] nums) {
		if(i < words.length) {
			nums[i] = Integer.parseInt(words[i]);
			copyValuesHelper(i + 1, words, nums);
		}
	}
	public static void copyValues(String[] words, int[] nums) {
		copyValuesHelper(0, words, nums);
	}
	public static void main(String[] args) {
		int len = args.length;
		int[] nums = new int[len];
		copyValues(args, nums);
		System.out.println(Arrays.toString(args));
		System.out.println(Arrays.toString(nums));
	}
}
