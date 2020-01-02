package personal.oop.practice2Factory;

public class Client {
    public static void main(String args[]){
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer(Manufacturer.LG );
        factoryOfComputerFactory.createComputer( Manufacturer.SAMSUNG );
        factoryOfComputerFactory.createComputer( Manufacturer.DELL );
        factoryOfComputerFactory.createComputer( Manufacturer.JIHWAN );
    }
}
