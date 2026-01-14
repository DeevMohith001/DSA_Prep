import java.util.Arrays;

public class vid31_QuickSort_usingRecursion {
    public static void main(String[] args) {
        // choose any element as pivot. After the first pass all the elements < pivot will be on LHS of pivot
        // and all the elements > pivot will be at RHS of pivot.
        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while (s <= e){
            // Also a reason why if it is already sorted it will not swap
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // Now pivot is at correct position, sort the two halves
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
