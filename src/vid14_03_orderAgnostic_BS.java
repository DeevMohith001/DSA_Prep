public class vid14_03_orderAgnostic_BS {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int result = search(arr, target);

        if (result!=-1){
            System.out.println("Element found at index number: "+ result);
        }
        else {
            System.out.println("Element not found");
        }
    }
    static int search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
