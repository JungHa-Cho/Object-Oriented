package personal.oop.practice3.impl;

/**
 * The type Counter.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-01
 */
public class RockPaperScissorsGameCounter {
    private int rock;
    private int paper;
    private int scissors;

    /**
     * Instantiates a new Counter.
     */
    public RockPaperScissorsGameCounter() {
        this.rock = 0;
        this.paper = 0;
        this.scissors = 0;
    }

    /**
     * Count.
     *
     * @param rockPaperScissors the rock paper scissors
     */
    public void calculate(String rockPaperScissors) {
        switch (RockPaperScissorsEnum.valueOf(rockPaperScissors)) {
            case ROCK:
                rock++;
                break;
            case PAPER:
                paper++;
                break;
            case SCISSORS:
                scissors++;
                break;
        }
    }

    /**
     * Gets rock count.
     *
     * @return the rock count
     */
    public int getRock() {
        return rock;
    }

    /**
     * Gets paper count.
     *
     * @return the paper count
     */
    public int getPaper() {
        return paper;
    }

    /**
     * Gets scissors count.
     *
     * @return the scissors count
     */
    public int getScissors() {
        return scissors;
    }
}
