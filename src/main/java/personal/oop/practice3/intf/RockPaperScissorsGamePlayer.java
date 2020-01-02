package personal.oop.practice3.intf;

import java.util.Random;

/**
 * The type Player.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public class RockPaperScissorsGamePlayer extends Player {

    private RockPaperScissors rockPaperScissors;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public RockPaperScissorsGamePlayer(String name) {
        super(name);
    }

    @Override
    String play() {
        System.out.println(name + "은 " + rockPaperScissors + "를 선택했다.");
        return rockPaperScissors.name();
    }

    @Override
    public void select() {
        sleep();
        rockPaperScissors = RockPaperScissors.values()[new Random(System.currentTimeMillis()).nextInt(3)];
    }

    public RockPaperScissors getRockPaperScissors() {
        return rockPaperScissors;
    }

    private void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
