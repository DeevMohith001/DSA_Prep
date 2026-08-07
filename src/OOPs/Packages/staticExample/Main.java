package OOPs.Packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(25, "kunal", 2000, false); // No need to import if files are in same folder/package.
        Human mohit = new Human(21, "mohit", 1000, true);
        Human divya = new Human(21, "divya", 1000, true);
        System.out.println(mohit.age);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population); // Access static variables only with class name, not the object name. It works with object but it's not conventional.

        // Static variables are independent of objects. If we do not create any object(kunal, mohit), still we can access population using class name(Human).
        // When a member is declared static, it can be accessed before any of the object of the class is being created without referencing to that object.

        //greeting(); // Inside a static method, we cannot use anything which is non-static.
        // static method can only access static data.
    }
    static void fun(){
//        greeting(); // won't work due to same reason written above
        // we cannot use this because it requires an instance but the function we are using in, it doesn't depend on instances

        //we cannot access non-static stuff without referencing their instances in a static context

        // hence here we are referencing it
        Main obj = new Main();
        obj.greeting();// non-static ---> object required
    }
    void greeting(){
        fun();
        System.out.println("Hello");
    }
}
