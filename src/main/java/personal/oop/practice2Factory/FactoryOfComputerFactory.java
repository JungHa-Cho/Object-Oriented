package personal.oop.practice2Factory;


import personal.oop.practice2Factory.inf.ComputerFactory;

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
