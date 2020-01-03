package personal.oop.practice3.impl;

/**
 * The enum Rock paper scissors.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public enum RockPaperScissorsEnum {
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

    RockPaperScissorsEnum(String property) {
        this.property = property;
    }

    /**
     * From name rock paper scissors.
     *
     * @param compare the compare
     * @return the rock paper scissors
     */
    public static RockPaperScissorsEnum fromName(String compare) {
        for (RockPaperScissorsEnum rockPaperScissorsEnum : RockPaperScissorsEnum.values()) {
            if (rockPaperScissorsEnum.property == compare)
                return rockPaperScissorsEnum;
        }
        return null;
    }

    @Override
    public String toString() {
        return property;
    }
}
