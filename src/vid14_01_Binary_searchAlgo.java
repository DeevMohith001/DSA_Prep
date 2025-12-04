public class vid14_01_Binary_searchAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        int result = binary(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }
    public static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
        int mid_val = start + (end - start) / 2;
            if (target == arr[mid_val]) {
                return mid_val;
            } else if (target > arr[mid_val]) {
                start = mid_val + 1;
            } else {
                end = mid_val - 1;
            }
        }
        return -1;
    }
}
