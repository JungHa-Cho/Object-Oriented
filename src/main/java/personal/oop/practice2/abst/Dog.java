package personal.oop.practice2.abst;

public abstract class Dog extends Animal{

    public abstract void bite();

    @Override
    public void sleep() {
        System.out.println("[Dog] 잔다.");
    }

    public void bark(){
        System.out.println("[Dog] 짖다");
    }

}
