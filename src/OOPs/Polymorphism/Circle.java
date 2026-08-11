package OOPs.Polymorphism;

public class Circle extends Shapes{
    // This will run when obj of circle is created, hence it iss overriding the parent method.
    // If want to check if a function is overridden, just put the annotation above it
    @Override // annotation
    void area(){
        System.out.println("area is pi*r*r");
    }
}
