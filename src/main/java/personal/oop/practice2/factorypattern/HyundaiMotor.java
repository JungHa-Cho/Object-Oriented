package personal.oop.practice2.factorypattern;

public class HyundaiMotor extends Motor {
    @Override
    protected void moveMotor() {
        System.out.println("현대 모터가 움직인다");
    }
}
