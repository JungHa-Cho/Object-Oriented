package personal.oop.practice3.impl;

import personal.oop.practice3.abst.Player;

import java.util.Random;

/**
 * The type Player.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public class RockPaperScissorsGamePlayer extends Player {

    private RockPaperScissorsEnum rockPaperScissorsEnum;

    /**
     * Instantiates a new Player.
     *
     * @param name the name
     */
    public RockPaperScissorsGamePlayer(String name) {
        super(name);
    }

    /**
     * Gets rock paper scissors.
     *
     * @return the rock paper scissors
     */
    public RockPaperScissorsEnum getRockPaperScissorsEnum() {
        return rockPaperScissorsEnum;
    }

    @Override
    public String play() {
        System.out.println(getName() + "은 " + rockPaperScissorsEnum + "를 냈다.");
        return rockPaperScissorsEnum.name();
    }

    @Override
    public void select() {
        sleep();
        rockPaperScissorsEnum = getRockPaperScissors();
        System.out.println("- " + getName() + "은 " + rockPaperScissorsEnum + "를 마음속으로 골랐다.");
    }

    private RockPaperScissorsEnum getRockPaperScissors() {
        return RockPaperScissorsEnum.values()[getRandom()];
    }

    private int getRandom() {
        return new Random(System.currentTimeMillis()).nextInt(3);
    }

    private void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
