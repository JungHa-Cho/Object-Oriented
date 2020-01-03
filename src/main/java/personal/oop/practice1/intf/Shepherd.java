package personal.oop.practice1.intf;

/**
 * The type Shepherd.
 */
public class Shepherd implements BlackFur{

    @Override
    public void bite() {
        System.out.println("[Shepherd] bite.");
    }

    @Override
    public void eat() {
        System.out.println("[Shepherd] eat.");
    }

    @Override
    public void sleep() {
        System.out.println("[Shepherd] sleep.");
    }

    @Override
    public void wash() {
        System.out.println("[Shepherd] wash.");
    }

    @Override
    public void blackMolting() {
        System.out.println("[Shepherd] blackMolting.");
    }

    /**
     * Test.
     */
    public void test() {
        System.out.println("[Shepherd] test.");
    }
}
