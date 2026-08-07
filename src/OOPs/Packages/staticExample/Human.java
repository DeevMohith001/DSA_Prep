package OOPs.Packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population; // thing which is independent of object, its static

    static void message(){
        System.out.println("Hello");
//        System.out.println(this.age); // can't use this
    }

    public Human(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1; // Access static variables only with class name, not the object name. It works with object but it's not conventional.
    }
}
