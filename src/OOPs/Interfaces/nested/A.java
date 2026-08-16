package OOPs.Interfaces.nested;

public class A {
    // nested interface
    public interface nestedInterface{
        boolean isOdd(int num);
    }
}

// Nested interface can be declared as public, protected or private
// but top level interfaces has to be declared as public or default one.

class B implements A.nestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}

