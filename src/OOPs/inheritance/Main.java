package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // it will a function which has zero argument.
        System.out.println(box.l + " " + box.w + " " + box.h);

        Box box1 = new Box(4); // it will a function which has one argument.
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
    }
}
