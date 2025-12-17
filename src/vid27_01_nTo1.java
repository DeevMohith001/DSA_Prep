public class vid27_01_nTo1 {
    public static void main(String[] args) {
//        int ans = factorial(5);
//        System.out.println(ans);

        int ans = DigitSum(1342);
        System.out.println(ans);
    }

    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if (n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if (n <= 1 ){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int DigitSum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + DigitSum(n/10);
    }
}
