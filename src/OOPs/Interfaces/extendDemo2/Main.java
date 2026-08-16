package OOPs.Interfaces.extendDemo2;

public class Main implements A, B {
    @Override // overridden methods should not be private
    public void greet() {

    }

//    @Override
//    public void fun() {
//
//    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
