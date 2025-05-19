package Q6;

public class ElementRankInStream {
	public static int findRank(int[] arr, int x) {
        int rank = 0;

        for (int num : arr) {
            if (num <= x) {
                rank++;
            }
        }

        return rank;
    }

    public static void main(String[] args) {
        int[] stream = {10, 20, 15, 3, 4, 4, 1};
        int x = 4;

        int rank = findRank(stream, x);

        System.out.println("Rank of " + x + " is: " + rank);
    }
}
