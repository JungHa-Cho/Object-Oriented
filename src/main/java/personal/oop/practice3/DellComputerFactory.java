package personal.oop.practice3;

public class DellComputerFactory implements ComputerFactory{
    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
