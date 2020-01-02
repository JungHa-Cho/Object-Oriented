package personal.oop.practice2Factory;

import personal.oop.practice2Factory.inf.ComputerFactory;
import personal.oop.practice2Factory.inf.Keyboard;
import personal.oop.practice2Factory.inf.Mouse;

public class DellComputerFactory implements ComputerFactory {

    public DellComputerFactory(){
        System.out.println("DELL 컴퓨터 팩토리 생성자");
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
