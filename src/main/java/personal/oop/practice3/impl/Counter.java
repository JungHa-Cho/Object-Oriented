package personal.oop.practice3.impl;

/**
 * The type Counter.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2020 -01-01
 */
public class Counter {
    private int rockCount = 0;
    private int paperCount = 0;
    private int scissorsCount;

    /**
     * Instantiates a new Counter.
     */
    public Counter() {
        this.rockCount = 0;
        this.paperCount = 0;
        this.scissorsCount = 0;
    }

    /**
     * Count.
     *
     * @param rockPaperScissors the rock paper scissors
     */
    public void calculate(String rockPaperScissors) {
        switch (RockPaperScissors.valueOf(rockPaperScissors)) {
            case ROCK:
                rockCount++;
                break;
            case PAPER:
                paperCount++;
                break;
            case SCISSORS:
                scissorsCount++;
                break;
        }
    }

    /**
     * Gets rock count.
     *
     * @return the rock count
     */
    public int getRockCount() {
        return rockCount;
    }

    /**
     * Gets paper count.
     *
     * @return the paper count
     */
    public int getPaperCount() {
        return paperCount;
    }

    /**
     * Gets scissors count.
     *
     * @return the scissors count
     */
    public int getScissorsCount() {
        return scissorsCount;
    }
}
