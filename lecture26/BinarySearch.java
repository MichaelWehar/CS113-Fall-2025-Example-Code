public class BinarySearch {
    // l stands for left index bound
    // r stands for right index bound
    public static boolean binarySearchHelper(int[] arr, int value, int l, int r) {
        if(l > r) {
            return false;
        } else {
            int mid = (r - l) / 2 + l; // Or, (l + r) / 2;
            if(value < arr[mid]) {
                return binarySearchHelper(arr, value, l, mid - 1);
            } else if(value > arr[mid]) {
                return binarySearchHelper(arr, value, mid + 1, r);
            } else {
                System.out.println(mid);
                return true;
            }
        }
    }
    public static boolean binarySearch(int[] arr, int value) {
        return binarySearchHelper(arr, value, 0, arr.length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 25, 40, 41, 46, 50, 94, 101};
        int k1 = 40;
        int k2 = 82;
        System.out.println("Does arr contain k1? " + binarySearch(arr, k1));
        System.out.println("Does arr contain k2? " + binarySearch(arr, k2));
    }
}