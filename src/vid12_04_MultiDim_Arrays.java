import java.util.Arrays;
import java.util.Scanner;

public class vid12_04_MultiDim_Arrays {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        Scanner in = new Scanner(System.in);
//        int [][] arr = new int[3][3];

//        It stores internally like this
//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index
//        };
//        System.out.println(arr[1][0]);// return 4

        int [][] arr = new int[3][3];
        System.out.println(arr.length);// no. of rows

        //input
        for (int row = 0; row<arr.length; row++){
            // for each column in every row
            for (int col=0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
//        for (int row = 0; row<arr.length; row++){
//            // for each column in every row
//            for (int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // it will make it to look like a matrix
//        }

         // output
//        for (int row = 0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row])); // proper matrix
//        }

        // Using for each loop
//        for (int[] a : arr){
//            System.out.println(Arrays.toString(a)); // Same as above of this
//        }

        // Array of string(Example)

        String[] str = new String[4];
        System.out.println(str[0]);

        for (String ele : str){
            System.out.println(ele);
        }
    }
}
