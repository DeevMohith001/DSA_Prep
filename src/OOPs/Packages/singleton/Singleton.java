package OOPs.Packages.singleton;

public class Singleton {
    // this function will be used in this file only, if we make it private
    private int num = 0;
    private Singleton() {

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj is created or not
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}

// Whatever thing is private, it can be run only in this file