package personal.oop.practice3.intf;

/**
 * The interface Player.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public interface Selectable {
    /**
     * 가위 바위 보 중 하나를 선택한다.
     *
     * @return the rock paper scissors
     */
    RockPaperScissors select();
}