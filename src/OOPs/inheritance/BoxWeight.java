package OOPs.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        super();
        this.weight =-1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); // calling the parent class constructor. Used to initiate values present in parent class.
        this.weight = weight;


//        System.out.println(super.weight); // super is a reference to the parent class.
        // It is used to:
        // 1. Access parent class methods
        //2. Access parent class fields
        // 3. Call parent class constructor

    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
// Child class - Hey parent class, i really do care about you so please initialize yourself first.
