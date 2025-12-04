public class vid23_02_recursion {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){

        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // If you are calling a function again and again, you can treat it as a separate call in the stack

        // This is called tail recursion because it is the last function call
        print1(n+1);
    }
}
/*
WHY RECURSION:
1. It helps us in solving bigger/complex problems in a simpler way.
2. We can convert recursion solution into iteration and vise versa.
 */


/*
1. Base condition in Recursion - Condition where our recursion will stop making new calls.
2. As many times you call the function, it will take memory separately
*/

/*
No base condition means - Function calls will keep happening, stack will be filled
again and again --> memory of computer will exceed the limit --> Stack Overflow Error
 */
