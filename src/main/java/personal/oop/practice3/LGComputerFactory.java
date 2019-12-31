package personal.oop.practice3;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new LGkeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
