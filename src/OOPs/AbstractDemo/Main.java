package OOPs.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(28);
        son.career();

        Daughter daughter = new Daughter(26);
        daughter.career();

        // Can we create object of an abstract class --> NO
//        Parent mom = new Parent();

    }
}
// Every child class has to override all the abstract methods in the parent class.

