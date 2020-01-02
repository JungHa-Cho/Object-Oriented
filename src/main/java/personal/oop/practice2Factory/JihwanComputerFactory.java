package personal.oop.practice2Factory;

import personal.oop.practice2Factory.inf.ComputerFactory;
import personal.oop.practice2Factory.inf.Keyboard;
import personal.oop.practice2Factory.inf.Mouse;

public class JihwanComputerFactory implements ComputerFactory {

    public JihwanComputerFactory(){
        System.out.println("지환 컴퓨터 팩토리 생성자");
    }

    @Override
    public Keyboard createKeyboard() {
        return new JihwanKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new JihwanMouse();
    }
}
