package OOPs.Packages.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // can't access the constructor because it is private
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // All 3 ref variables are pointing to just one object
    }
}
