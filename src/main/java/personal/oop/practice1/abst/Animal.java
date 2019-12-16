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
     * Eat.
     */
    public abstract void eat();

    /**
     * Smell.
     */
    public void smell() {
        System.out.println("동물 지린내");
    }
}
