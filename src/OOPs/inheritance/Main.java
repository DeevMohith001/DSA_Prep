package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(); // it will a function which has zero argument.
        System.out.println(box.l + " " + box.w + " " + box.h);

        Box box1 = new Box(4); // it will a function which has one argument.
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        // For inheritance. For zero arguments
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.h + " " + box2.weight);

        // For inheritance. For one argument
        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box3.h + " " + box3.weight);
    }
}
