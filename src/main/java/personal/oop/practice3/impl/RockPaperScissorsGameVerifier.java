package personal.oop.practice3.impl;

import personal.oop.practice3.abst.Rule;

/**
 * The type Verify.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-01
 */
public class RockPaperScissorsGameVerifier implements Rule {

    private RockPaperScissorsGameCounter rockPaperScissorsGameCounter;

    /**
     * Instantiates a new Verify.
     *
     * @param rockPaperScissorsGameCounter the counter
     */
    public RockPaperScissorsGameVerifier(RockPaperScissorsGameCounter rockPaperScissorsGameCounter) {
        this.rockPaperScissorsGameCounter = rockPaperScissorsGameCounter;
    }

    /**
     * Verify rose rock paper scissors.
     *
     * @return the rock paper scissors
     */
    @Override
    public String verify() {
        if (isEmptyInRock())
            return RockPaperScissorsEnum.PAPER.name();
        else if (isEmptyInPaper())
            return RockPaperScissorsEnum.SCISSORS.name();
        else if (isEmptyInScissors())
            return RockPaperScissorsEnum.ROCK.name();
        else
            return null;
    }

    private boolean isEmptyInScissors() {
        return rockPaperScissorsGameCounter.getRock() > 0 && rockPaperScissorsGameCounter.getPaper() > 0 && rockPaperScissorsGameCounter.getScissors() == 0;
    }

    private boolean isEmptyInPaper() {
        return rockPaperScissorsGameCounter.getRock() > 0 && rockPaperScissorsGameCounter.getPaper() == 0 && rockPaperScissorsGameCounter.getScissors() > 0;
    }

    private boolean isEmptyInRock() {
        return rockPaperScissorsGameCounter.getRock() == 0 && rockPaperScissorsGameCounter.getPaper() > 0 && rockPaperScissorsGameCounter.getScissors() > 0;
    }
}
