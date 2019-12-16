package personal.oop.practice1.intf;

/**
 * The type Sparrow.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class Sparrow implements Bird {
    @Override
    public void twitter() {
        System.out.println("[참새] 찍찍댐");
    }

    @Override
    public void eat() {
        System.out.println("[참새] 참새는 뭘먹지?");
        System.out.println("");
    }

    public void ea() {

    }
}
