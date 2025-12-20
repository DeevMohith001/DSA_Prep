public class vid27_02_concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);

//        n-- vs --n
        /*
        n--  = for n=5,it will always pass 5
        --n   = subtract first then pass 5
         */
    }

}
