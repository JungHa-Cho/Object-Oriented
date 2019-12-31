package personal.oop.practice3;

public class SamsungComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
