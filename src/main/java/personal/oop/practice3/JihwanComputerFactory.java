package personal.oop.practice3;

public class JihwanComputerFactory implements ComputerFactory {
    /*
    * TODO
    */
    @Override
    public Keyboard createKeyboard() {
        return new JihwanKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new JihwanMouse();
    }
}
