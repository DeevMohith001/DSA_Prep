public class vid13_q4_searchIn_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {9, 18, 5},
                {6, 7, 14}
        };
        int target = 18;

        int[] ans = search(arr, target);
        if (ans[0] == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at row " + ans[0] + ", column " + ans[1]);
        }
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j}; // return the position
                }
            }
        }
        return new int[]{-1, -1}; // target not found
    }
}
