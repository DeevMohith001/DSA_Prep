package OOPs.Interfaces.extendDemo2;

public interface A {
//    static interfaces methods should always have a body
    // called via the interface name
    static void greeting(){
        System.out.println("Hey i am static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
