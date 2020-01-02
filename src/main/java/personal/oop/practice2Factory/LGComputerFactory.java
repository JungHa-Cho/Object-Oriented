package personal.oop.practice2Factory;

import personal.oop.practice2Factory.inf.ComputerFactory;
import personal.oop.practice2Factory.inf.Keyboard;
import personal.oop.practice2Factory.inf.Mouse;

public class LGComputerFactory implements ComputerFactory {
    public LGComputerFactory(){
        System.out.println("LG 컴퓨터 팩토릴 생성자");
    }
    @Override
    public Keyboard createKeyboard() {
        return new LGkeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
