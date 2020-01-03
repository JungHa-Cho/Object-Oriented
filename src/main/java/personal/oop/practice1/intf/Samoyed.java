package personal.oop.practice1.intf;

/**
 * The type Samoyed.
 */
public class Samoyed implements WhiteFur {

    @Override
    public void bite() {
        System.out.println("[Samoyed] bite.");
    }

    @Override
    public void eat() {
        System.out.println("[Samoyed] eat.");
    }

    @Override
    public void sleep() {
        System.out.println("[Samoyed] sleep.");
    }

    @Override
    public void wash() {
        System.out.println("[Samoyed] wash");
    }

    @Override
    public void whiteMolting() {
        System.out.println("[Samoyed] whiteMolting.");
    }
}
