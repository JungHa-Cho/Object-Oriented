package personal.oop.practice1.abst;

/**
 * The type Dog.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public abstract class Dog extends Animal {
    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     */
    Dog(String name) {
        super(name);
    }

    @Override
    public void smell() {
        // super.smell();
        System.out.println("Dog smell");
    }

    public abstract void bark();
}
