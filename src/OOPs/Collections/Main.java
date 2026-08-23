package OOPs.Collections;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(23);
        list2.add(233);
        list2.add(234);
        list2.add(2);
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(4005);
        vector.add(4);
        vector.add(452);
        vector.add(456);
        System.out.println(vector);
    }
}
