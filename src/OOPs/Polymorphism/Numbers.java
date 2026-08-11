package OOPs.Polymorphism;

public class Numbers {
    // method name is same but the parameters are different
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);
        obj.sum(1, 2, 3);
//        obj.sum(4, 5, 6, 7); // There is no function that takes 4 arguments.
    }
}
