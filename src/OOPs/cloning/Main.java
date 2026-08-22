package OOPs.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mohit = new Human(22, "mohit");
//        Human twin = new Human(mohit);

        Human twin = (Human)mohit.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(mohit.arr));

    }
}

// Clone is a method in the object class that can be used to make these copies