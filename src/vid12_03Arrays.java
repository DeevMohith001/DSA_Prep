import java.util.Arrays;

public class vid12_03Arrays {
    public static void main(String[] args) {
        // Strings are immutable in java and arrays are mutable.
        int [] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
/*
This will change the value of arr[0]
 */
