package Day202;

public class Division extends Calculator {
    @Override
    public void add() {
        System.out.println("This is not an addition");
    }

    @Override
    public void sub() {
        System.out.println("This is not a subtraction");
    }

    @Override
    public void mul() {
        System.out.println("This is not a multiplication");
    }

    @Override
    public void div() {
        System.out.println("This is a division");
    }
}
