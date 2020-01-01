package personal.oop.practice3.common;

import personal.oop.practice3.intf.RockPaperScissors;

/**
 * The type Verify.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-01
 */
public class Verify {

    private Counter counter;

    /**
     * Instantiates a new Verify.
     *
     * @param counter the counter
     */
    public Verify(Counter counter) {
        this.counter = counter;
    }

    /**
     * Verify rose rock paper scissors.
     *
     * @return the rock paper scissors
     */
    public RockPaperScissors verifyRose() {
        if (counter.getRockCount() == 0 && counter.getPaperCount() > 0 && counter.getScissorsCount() > 0) {
            return RockPaperScissors.PAPER;
        } else if (counter.getRockCount() > 0 && counter.getPaperCount() == 0 && counter.getScissorsCount() > 0) {
            return RockPaperScissors.SCISSORS;
        } else if (counter.getRockCount() > 0 && counter.getPaperCount() > 0 && counter.getScissorsCount() == 0) {
            return RockPaperScissors.ROCK;
        } else {
            return null;
        }
    }
}
