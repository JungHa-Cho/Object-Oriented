package personal.oop.practice3.impl;

/**
 * The enum Rock paper scissors.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public enum RockPaperScissors {
    /**
     * ROCK IS 바위.
     */
    ROCK("ROCK"),
    /**
     * PAPER IS 보.
     */
    PAPER("PAPER"),
    /**
     * SCISSORS IS 가위.
     */
    SCISSORS("SCISSORS");

    private String property;

    RockPaperScissors(String property) {
        this.property = property;
    }

    public static RockPaperScissors fromName(String compare) {
        for (RockPaperScissors rockPaperScissors : RockPaperScissors.values()) {
            if (rockPaperScissors.property == compare)
                return rockPaperScissors;
        }
        return null;
    }

    @Override
    public String toString() {
        return property;
    }
}
