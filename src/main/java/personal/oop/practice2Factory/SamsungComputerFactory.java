package personal.oop.practice2Factory;

import personal.oop.practice2Factory.inf.ComputerFactory;
import personal.oop.practice2Factory.inf.Keyboard;
import personal.oop.practice2Factory.inf.Mouse;

public class SamsungComputerFactory implements ComputerFactory {

    public SamsungComputerFactory(){
        System.out.println("삼성 컴퓨터 팩토리 생성자");
    }

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
