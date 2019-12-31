package personal.oop.practice2.factorypattern.intf;

public class LGDoor extends Door {

    @Override
    protected void doClose() {
        System.out.println("close LG DOOR");
    }

    @Override
    protected void doOpen() {
        System.out.println("open LG DOOR");
    }
}
