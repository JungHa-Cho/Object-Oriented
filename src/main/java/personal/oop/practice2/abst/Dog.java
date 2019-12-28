package personal.oop.practice2.abst;

/**
 * The type Dog.
 */
public abstract class Dog extends Animal{

    /**
     * Bite.
     */
    public abstract void bite();

    @Override
    public void sleep() {
        System.out.println("[Dog] 잔다.");
    }

    /**
     * Bark.
     */
    public void bark(){
        System.out.println("[Dog] 짖다");
    }

}
