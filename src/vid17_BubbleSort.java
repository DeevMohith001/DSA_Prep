import java.util.Arrays;

public class vid17_BubbleSort {
    public static void main(String[] args) {
        int[] arr  =  {5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // Swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped){
                break;
            }
        }
    }
}
/*
With the first pass through the array, the largest element come to the end
 */

/*
Why does j start from 1?
Because you're comparing arr[j] with arr[j - 1]. If j started at 0, arr[-1] would be an error.

Why does it go till arr.length - i?
i tells how many largest elements have already bubbled to the right end of the array and are now in place.

So there's no need to check the last i elements again — they're already sorted!
 */
