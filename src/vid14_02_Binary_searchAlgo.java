public class vid14_02_Binary_searchAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 14;
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
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
