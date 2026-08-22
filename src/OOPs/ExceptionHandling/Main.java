package OOPs.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a/b;
            divide(a,b);
            String name = "Mohit";
            if (name.equals("Mohit")){
                throw new MyException("name is Mohit");
            }
        }catch (MyException e){ // If there is any arithmetic exception, it will call this other the lower one.
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){ // If there is any arithmetic exception, it will call this other the lower one.
            System.out.println(e.getMessage());
        } catch (Exception e){ // Exception includes everything
            System.out.println("Normal exception");
        }finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
