public class vid13_q3_FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int minValue = Mini(arr); // call method and get minimum
        System.out.println("Minimum value is: " + minValue);
    }

    static int Mini(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MAX_VALUE; // or handle the empty array case
        }

        int min = arr[0]; // start assuming first element is min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
