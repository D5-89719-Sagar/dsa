package Q4;

public class NthOccurrenceSearch {
	public static int findNthOccurrence(int[] arr, int target, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == n) {
                    return i; 
                }
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2, 3};
        int target = 3;
        int n = 4;

        int index = findNthOccurrence(arr, target, n);

        if (index != -1) {
            System.out.println("The " + n + "th occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("The " + n + "th occurrence of " + target + " was not found.");
        }
    }
}
