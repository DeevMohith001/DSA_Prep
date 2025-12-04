import java.util.Arrays;

public class vid16_02_BinarySearch_2Darrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 29;

        System.out.println(Arrays.toString(BinarySearch(matrix,37)));
    }
    
    static int[] BinarySearch(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col]==target){
                return new int[]{row, col};
            } else if (matrix[row][col]>target) {
                col--;
            }else {
                row++;
            }
        }
        return new int[]{-1, -1};
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
