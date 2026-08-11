package OOPs.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight =-1;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        super(l, b, h); // calling the parent class constructor. Used to initiate values present in parent class.
        this.weight = weight;
    }
}
