package Day202;

public class Addition extends Calculator {
    @Override
    public void add() {
        System.out.println("Addition method");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction method");
    }

    @Override
    public void mul() {
        System.out.println("Multiplication method");
    }

    @Override
    public void div() {
        System.out.println("Division method");
    }
}
