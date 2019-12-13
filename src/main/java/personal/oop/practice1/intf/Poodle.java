package personal.oop.practice1.intf;

/**
 * The type Poodle.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class Poodle implements Dog {
    @Override
    public void bark() {
        System.out.println("[Poodle] 푸월월푸월");
    }

    @Override
    public void eat() {
        System.out.println("[Poodle] 개밥 먹음");
    }
}
