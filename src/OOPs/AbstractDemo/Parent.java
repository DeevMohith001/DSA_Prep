package OOPs.AbstractDemo;

public abstract class Parent {

    int age;

    // Can we create static methods in abstract classes--> check
    static void hello(){
        System.out.println("hey");
    }

    abstract void career();
    abstract void partner();
}

// Abstract methods --> no body of the function allowed