package personal.oop.practice2.intf;

public class Persian implements Cat{
    @Override
    public void meow() {
        System.out.println("[Persian] meow");
    }

    @Override
    public void eat() {
        System.out.println("[Persian] eat.");
    }

    @Override
    public void sleep() {
        System.out.println("[Persian] sleep");
    }

    @Override
    public void wash() {
        System.out.println("[Persian] wash");
    }
}
