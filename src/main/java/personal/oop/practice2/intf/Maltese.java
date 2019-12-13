package personal.oop.practice2.intf;

/**
 * 일반 클래스에서 인터페이스 상속시 강제 Override
 */
public class Maltese implements WhiteFur {

    @Override
    public void bite() {
        System.out.println("[Maltese] bite.");
    }

    @Override
    public void eat() {
        System.out.println("[Maltese] eat.");
    }

    @Override
    public void sleep() {
        System.out.println("[Maltese] sleep.");
    }

    @Override
    public void whiteMolting() {
        System.out.println("[Maltese] whiteMolting.");
    }

    @Override
    public void wash() {
        System.out.println("[Maltese] wash.");
    }
}
