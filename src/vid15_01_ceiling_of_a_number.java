/*
ceiling of a number means that, find the smallest number in this array
that is greater than or equal to the target number.
if arr = {2, 3, 5, 9, 14, 16, 18}, if target = 15 than the ceiling of the number is 16
because 16 is just greater than or equal to the target number.
 */

public class vid15_01_ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    public static int ceiling(int[] arr, int target){

        // But what if the target element is greater than the largest element in the array
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
//        return (start < arr.length) ? arr[start] : -1; // For ceiling of a number
        return (start < arr.length) ? arr[end] : -1; // For floor of a number
//        return arr[start];
//        return arr[end];
    }
}
