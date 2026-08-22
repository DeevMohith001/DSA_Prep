package OOPs.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mohit = new Human(22, "mohit");
//        Human twin = new Human(mohit);

        Human twin = (Human)mohit.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}

// Clone is a method in the object class that can be used to make these copies