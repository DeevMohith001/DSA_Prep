package OOPs.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin =  (Human)super.clone(); // this is actually shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

// Shallow copy --> twins(copies) will be created only of primitives not object. For objects, it will point to the original one.
// Deep copy --> Here every thing will be copied, either if it is object or primitive.