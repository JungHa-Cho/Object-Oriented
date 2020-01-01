package personal.oop.practice2.factorypattern.intf;

public class DoorFactory {

    public static Door createDoor(VendorID vendorID) {
        Door door = null;

        switch (vendorID) {
            case LG:
                door = new LGDoor();
                break;
            case HYUNDAI:
                door = new HyundaiDoor();
                break;
        }
        return door;
    }
}