package personal.oop.practice3.intf;

import java.util.Random;

/**
 * The type Player.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public class Player implements Selectable {

    private String name;
    private RockPaperScissors rockPaperScissors;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public Player(String name) {
        this.name = name;
    }

    @Override
    public RockPaperScissors select() {
        sleep();
        rockPaperScissors = RockPaperScissors.values()[new Random(System.currentTimeMillis()).nextInt(3)];
        System.out.println(name + "은 " + rockPaperScissors + "를 선택했다.");
        return rockPaperScissors;
    }

    public RockPaperScissors getRockPaperScissors() {
        return rockPaperScissors;
    }

    public String getName() {
        return name;
    }

    private void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
