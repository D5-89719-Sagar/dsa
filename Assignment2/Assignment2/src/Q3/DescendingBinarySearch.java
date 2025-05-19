package Q3;
public class DescendingBinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                
                high = mid - 1;
            } else {
              
                low = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 60;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
