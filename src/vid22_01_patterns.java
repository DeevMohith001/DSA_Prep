public class vid22_01_patterns {
    public static void main(String[] args) {
        pattern5(3);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
//            when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = n; row > 0 ; row--) {
            for (int col = 1; col <= row  ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n-1 || col == 0 || col == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
