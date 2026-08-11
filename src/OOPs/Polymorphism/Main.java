package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area(); // I am in shapes
        circle.area(); // area is pi*r*r
        square.area(); // area is square of side
    }
}
// Poly --> Many, Morphism --> Ways to represent.
// Polymorphism means many ways to represent a single entity or item.

// Method overloading --> When a class has multiple method with the same name but the number or type or order of the parameters or the return type can be different.
// eg --> Multiple constructors

// Method Overriding --> When a child class has a method named same as the parent class. Just the body is different.

// Types of Polymorphism:
// 1. Compile time/ Static Polymorphism--> Achieved via method overloading.
//2. Runtime/ Dynamic Polymorphism --> Achieved via method overriding.