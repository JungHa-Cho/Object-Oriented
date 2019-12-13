package personal.oop.practice1.abst;

/**
 * The type Animal.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public abstract class Animal {

    /**
     * The Name.
     */
    String name;

    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     */
    Animal(String name) {
        this.name = name;
    }

    /**
     * Eat.
     */
    public abstract void eat();

    /**
     * Smell.
     */
    public void smell() {
        System.out.println("Animal smell");
    }
}
