package personal.oop.practice3;

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
