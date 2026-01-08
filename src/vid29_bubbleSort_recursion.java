import java.util.Arrays;

public class vid29_bubbleSort_recursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int last, int index){
        if (last==0){
            return;
        }
        if (index < last){

            if (arr[index] > arr[index+1]){
                //swap
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }

            bubble(arr, last, index+1);
        } else {
            bubble(arr, last-1, 0);
        }
    }
}
