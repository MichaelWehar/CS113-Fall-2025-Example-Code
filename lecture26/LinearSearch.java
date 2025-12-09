public class LinearSearch {
    public static boolean linearSearch(int[] arr, int k) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, -4, 0, 12, 25, 7, -2};
        int k1 = 12;
        int k2 = 17;
        System.out.println("Does arr contain k1? " + linearSearch(arr, k1));
        System.out.println("Does arr contain k2? " + linearSearch(arr, k2));
    }
}