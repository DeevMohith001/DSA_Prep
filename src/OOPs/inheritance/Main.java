package OOPs.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(); // it will a function which has zero argument.
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        Box box1 = new Box(4); // it will a function which has one argument.
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//
//        // For inheritance. For zero arguments
//        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.h + " " + box2.weight);
//
//        // For inheritance. For one argument
//        BoxWeight box3 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);
//
//        // This is a reference type of box, it is referencing to an object of type boxWeight
//        Box box4 = new BoxWeight(2, 3, 4, 8);// here parent is refering to a child class.
//        System.out.println(box4.w);

        // There are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // this is why it is showing error
//        BoxWeight box5 = new Box(2, 3,4 );
//        System.out.println(box5);

        BoxPrice box5 = new BoxPrice(2, 4, 8); // This will call a constructor which have 3 arguments
        BoxPrice box6 = new BoxPrice(); // This will call a constructor with zero arguments
    }
}
//A parent class can refer to a child class but child class cannot

// Above classes will have no knowledge of below classes. But below classes can have.

//Types of Inheritance:
// 1. Single Inheritance ----> One class extends another class. Box --> BoxWeight
// 2. MultiLevel Inheritance ----> One class extends another class and another will extend another. Box --> BoxWeight --> BoxPrice.
// 3. Multiple Inheritance ---> One class extending more than one classes. A ---> C, B ---> C. Here A and B both are parent classes
// Multiple Inheritance is not supported in Java because:
// If 2 or more parent classes have the same variables or properties then child class will get confused, which one to call.
// 4. Hierarchical Inheritance --> One class is inherited by many classes. A -->B, A --> C, A--->D.
// 5. Hybrid Inheritance(Not in Java) --> Combination of single and multiple inheritance. A --> B, A --> C, B and C-->D.