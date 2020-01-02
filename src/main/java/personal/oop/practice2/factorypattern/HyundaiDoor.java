package personal.oop.practice2.factorypattern;

public class HyundaiDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close Hyundai DOOR");
    }

    @Override
    protected void doOpen() {
        System.out.println("open Hyundai DOOR");
    }
}
