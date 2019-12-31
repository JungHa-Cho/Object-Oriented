package personal.oop.practice3;


import java.util.List;

public class FactoryOfComputerFactory {
    public void createComputer(Manufacturer manufacturer){
        ComputerFactory computerFactory = null;

        switch (manufacturer){
            case LG:
                computerFactory = new LGComputerFactory();
                break;
            case SAMSUNG:
                computerFactory = new SamsungComputerFactory();
                break;
            case JIHWAN:
                computerFactory = new JihwanComputerFactory();
                break;
            case DELL:
                computerFactory = new DellComputerFactory();
                break;

        }
        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
