package personal.oop.practice3.impl;

import personal.oop.practice3.abst.Rule;
import personal.oop.practice3.impl.Counter;
import personal.oop.practice3.impl.RockPaperScissors;

/**
 * The type Verify.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-01
 */
public class Verifier implements Rule {

    private Counter counter;

    /**
     * Instantiates a new Verify.
     *
     * @param counter the counter
     */
    public Verifier(Counter counter) {
        this.counter = counter;
    }

    /**
     * Verify rose rock paper scissors.
     *
     * @return the rock paper scissors
     */
    @Override
    public String verify() {
        if (counter.getRockCount() == 0 && counter.getPaperCount() > 0 && counter.getScissorsCount() > 0) {
            return RockPaperScissors.PAPER.name();
        } else if (counter.getRockCount() > 0 && counter.getPaperCount() == 0 && counter.getScissorsCount() > 0) {
            return RockPaperScissors.SCISSORS.name();
        } else if (counter.getRockCount() > 0 && counter.getPaperCount() > 0 && counter.getScissorsCount() == 0) {
            return RockPaperScissors.ROCK.name();
        } else {
            return null;
        }
    }
}
