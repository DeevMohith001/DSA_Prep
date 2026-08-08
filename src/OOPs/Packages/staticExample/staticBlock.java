package OOPs.Packages.staticExample;

// this ia a demo to show initialization of static variables
public class staticBlock {
    static int a=4;
    static int b;

    // this will only run once, when the first object is create. when the class is loaded for the first time
    static {
        System.out.println("hey");
        b=a*5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;

        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }
}
