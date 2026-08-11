package OOPs.inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;

//    @Override // we can't override static methods.
    // Static methods can be inherited but cannot be overridden
    // Overriding depends on objects, static doesn't depends on objects hence static methods cannot be overridden.
    static void greeting(){
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    // This will be called if we pass no argument
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    //  This will be called if we pass one argument
    Box(double side){
        this.w = side;
        this.l = side;
        this.h=side;
    }

    //  This will be called if we pass three argument
    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w =w;
    }

    Box(Box old){
        this.h = old.h;
        this.l=old.l;
        this.w = old.w;
    }

    public void info(){
        System.out.println("Running the box");
    }
}