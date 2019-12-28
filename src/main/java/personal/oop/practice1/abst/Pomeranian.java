package personal.oop.practice1.abst;

/**
 * The type Pomeranian.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class Pomeranian extends Dog {
    /**
     * Instantiates a new Animal.
     *
     * @param name the name
     */
    public Pomeranian(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("[Pomeranian] bark");
    }

    @Override
    public void eat() {
        System.out.println("[Pomeranian] eat");
    }

    /*@Override
    public void smell() {
        System.out.println("[포메라니안] 개 지린내");
    }*/
}
