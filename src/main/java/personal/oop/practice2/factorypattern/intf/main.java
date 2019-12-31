package personal.oop.practice2.factorypattern.intf;

public class main {
    public static void main(String[] args) {
        Door lgdoor = DoorFactory.createDoor( VendorID.LG );
        Motor lgmotor = MotorFactory.createMotor( VendorID.LG );

        lgmotor.setDoor( lgdoor );

        lgdoor.open();
        lgmotor.moveMotor();
    }
}
