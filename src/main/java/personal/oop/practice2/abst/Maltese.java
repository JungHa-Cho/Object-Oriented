package personal.oop.practice2.abst;

/**
 * The type Maltese.
 */
public class Maltese extends Dog {

    @Override
    public void eat() {
        System.out.println("[Maltese] 먹다.");
    }

    @Override
    public void sleep() {
        System.out.println("[Maltese] 잔다.");
    }

    @Override
    public void bite() {
        System.out.println("[Maltese] 물다.");
    }

    @Override
    public void bark() {
        System.out.println("[Maltese] 짖다.");
    }
}
