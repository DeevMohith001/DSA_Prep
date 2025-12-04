public class vid16_01_BinarySearch_2Darrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 29;
        int[] ans = search(matrix, target);
        if (ans[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at: Row " + ans[0] + ", Col " + ans[1]);
        }
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return new int[]{-1, -1}; // not found
    }
}
/*
🧾 Example Run for target = 29:
Start at matrix[0][3] = 40 → too big → move left

matrix[0][2] = 30 → too big → move left

matrix[0][1] = 20 → too small → move down

matrix[1][1] = 25 → too small → move down

matrix[2][1] = 29 → match! ✅ return [2, 1]
 */
