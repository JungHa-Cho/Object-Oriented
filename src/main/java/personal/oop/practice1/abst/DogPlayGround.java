package personal.oop.practice1.abst;

/**
 * The type Dog play ground.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-06
 */
public class DogPlayGround {
    private Dog dog;

    /**
     * Instantiates a new Dog play ground.
     *
     * @param dog the dog
     */
    DogPlayGround(Dog dog) {
        this.dog = dog;
    }

    public void play() {
        dog.bark();
        dog.doBehavior();
        dog.feed();
        dog.stink();
        dog.stink();
        dog.stink();
        dog.stink();
    }
}
