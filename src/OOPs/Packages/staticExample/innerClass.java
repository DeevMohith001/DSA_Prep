package OOPs.Packages.staticExample;

public class innerClass {
    static class test{
        String name;
        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test a = new test("mohit");
    }
}

// Outside class cannot be static only inner can be
//static class A{
//
//}
