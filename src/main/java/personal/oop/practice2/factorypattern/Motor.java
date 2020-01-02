package personal.oop.practice2.factorypattern;

public abstract class Motor {

    private MotorStatus motorStatus;

    private Direction direction;

    protected abstract void moveMotor();

    public Motor(){
        motorStatus = MotorStatus.UP;
        direction = Direction.UP;
    }

    public void setDoor(Door door){
        System.out.println("도어 클로즈");
        door.close();
    }

    public Direction getDirection(){
        return direction;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus (MotorStatus motorStatus){

    }

    public void move(Direction direction){
        if(direction == Direction.UP){
            return ;
        }

    }
}
