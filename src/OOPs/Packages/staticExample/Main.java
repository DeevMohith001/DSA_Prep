package OOPs.Packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(25, "kunal", 2000, false); // No need to import if files are in same folder/package.
        Human mohit = new Human(21, "mohit", 1000, true);
        System.out.println(mohit.age);
        System.out.println(kunal.population);
    }
}
