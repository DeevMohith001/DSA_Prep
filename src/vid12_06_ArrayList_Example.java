import java.util.ArrayList;
import java.util.Scanner;

public class vid12_06_ArrayList_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(67);
//        list.add(45);
//        list.add(85);
//        list.add(78);
//        list.add(6);
//        list.add(445);
//        list.add(84);
//        list.add(779);
//        list.add(557);
//        list.add(4);
//        list.add(850);
//        list.add(782);
//        System.out.println(list.contains(4));
//
//        System.out.println(list);
//        list.set(0,99); // 99 on 0th index
//        System.out.println(list);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
/*
new ArrayList<>(10) means: start with space for 10 elements.

The size grows automatically when more elements are added.

You never get a runtime error due to size — Java manages that for you.
 */