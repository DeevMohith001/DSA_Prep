package OOPs.Packages.staticExample;

// this ia a demo to show initialization of static variables
public class staticBlock {
    static int a=4;
    static int b;

    static {
        System.out.println("hey");
        b=a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }
}
