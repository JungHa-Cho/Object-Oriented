package personal.oop.practice2.factorypattern;

public class LGMotor extends Motor {
    @Override
    protected void moveMotor() {
        System.out.println("LG 모터가 움직인다");
    }
}
