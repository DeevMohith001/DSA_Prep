public class vid27_04_palindrome {
    public static void main(String[] args) {
        int n = 121;

        if (palin(n)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

    static int reverse(int n, int rev){
        if (n==0){
            return rev;
        }
        return reverse(n/10, (rev*10)+(n%10));
    }
    static boolean palin(int n){
        return n == reverse(n, 0);
    }

}
