public class vid23_01_FunctionCalls_workflow {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}
/*
While the function is not finished executing, it will remain in stack.

When a function finishes executing, it will be removed from stack and the flow of
program restored it to where the function was being called.
 */