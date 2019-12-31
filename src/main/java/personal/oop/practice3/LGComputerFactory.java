package personal.oop.practice3;

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
