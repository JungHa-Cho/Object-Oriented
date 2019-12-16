package personal.oop.practice1.abst;

/**
 * The type Dog.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public abstract class Dog extends Animal {
    @Override
    public void smell() {
        // super.smell();
        System.out.println("개 지린내");
    }

    public abstract void bark();
}
