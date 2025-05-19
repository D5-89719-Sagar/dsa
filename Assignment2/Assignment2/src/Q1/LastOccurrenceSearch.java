package Q1;

public class LastOccurrenceSearch {
	public static int findLastOccurrence(int[] arr, int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i; 
        }

        return index; 
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2, 3};
        int key = 3;

        int result = findLastOccurrence(arr, key);

        if (result != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + result);
        } else {
            System.out.println("Key not found.");
        }
    }
}
