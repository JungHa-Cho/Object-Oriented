package personal.oop.practice2.factorypattern.intf;

public class LGMotor extends Motor {
    @Override
    protected void moveMotor() {
        System.out.println("LG 모터가 움직인다");
    }
}
