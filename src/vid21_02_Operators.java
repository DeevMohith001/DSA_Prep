import java.util.ArrayList;

public class vid21_02_Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // output 195
        System.out.println("a" + "b"); // output ab
        System.out.println((char)('a' + 3)); // output d

        System.out.println("a" + 1); // output a1
        // this is same as after a few steps: "a" + "1"
        // Integer will be converted to integer that will call toString()

        System.out.println("Mohith" + new ArrayList<>()); // output Mohith[]
        System.out.println("Mohith" + new Integer(56)); // output Mohith56

        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans); // output 56[]

        System.out.println("a" + 'b'); // output ab
    }
}
